package maven.osgi.api.internal;

import java.text.MessageFormat;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import maven.osgi.api.GreetingService;
import maven.osgi.api.TranslationService;

@Component(xmlns="http://www.osgi.org/xmlns/scr/v1.2.0")
public class ConsoleGreetingService implements GreetingService {
	private TranslationService translationService;

	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	public void setTranslationService(TranslationService translationService) {
		this.translationService = translationService;
	}

	public void unsetTranslationService(TranslationService translationService) {
		if( this.translationService == translationService ) {
			this.translationService = null;
		}
	}

	@Override
	public void sayHello(String name) {
		System.out.println(MessageFormat.format(translationService.translate("Hello {0}!", Locale.getDefault()).orElse("Hello {0}!"), name));
	}

}

package maven.osgi.api.internal;

import java.util.Locale;
import java.util.Optional;

import org.osgi.service.component.annotations.Component;

import maven.osgi.api.TranslationService;

@Component(xmlns="http://www.osgi.org/xmlns/scr/v1.2.0")
public class BasicTranslationService implements TranslationService {

	@Override
	public Optional<String> translate(String term, Locale locale) {
		if( locale.equals(Locale.GERMAN) ) {
			return Optional.of("Hallo {0}!");
		} else if( locale.equals(Locale.FRENCH) ) {
			return Optional.of("Allô {0}!");
		}
		return Optional.empty();
	}

}

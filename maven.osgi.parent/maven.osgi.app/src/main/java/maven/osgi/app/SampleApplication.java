package maven.osgi.app;

import java.util.Locale;

import org.eclipse.fx.core.ServiceUtils;

import maven.osgi.api.GreetingService;

public class SampleApplication {

	public static void main(String[] args) {
		GreetingService service = ServiceUtils.getService(GreetingService.class).get();
		Locale.setDefault(Locale.ENGLISH);
		service.sayHello("Tom");

		Locale.setDefault(Locale.GERMAN);
		service.sayHello("Tom");

		Locale.setDefault(Locale.FRENCH);
		service.sayHello("Tom");
	}

}

package maven.osgi.api;

import java.util.Locale;
import java.util.Optional;

public interface TranslationService {
	public Optional<String> translate(String term, Locale locale);
}

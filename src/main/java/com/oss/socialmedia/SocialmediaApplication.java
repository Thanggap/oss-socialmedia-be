package com.oss.socialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import java.util.Optional;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

@SpringBootApplication
public class SocialmediaApplication {

	public static void main(String[] args) {
		// Initialize the SpringApplication
		SpringApplication app = new SpringApplication(SocialmediaApplication.class);
		
		// Try to get the API key
		final String apiKey = getApiKey();
		
		// Only set the property if apiKey is not null
		if (apiKey != null) {
			app.addInitializers(applicationContext -> {
				ConfigurableEnvironment env = applicationContext.getEnvironment();
				env.getSystemProperties().put("SENDINBLUE_API_KEY", apiKey);
			});
		}
		
		app.run(args);
	}
	
	/**
	 * Attempts to retrieve the API key from .env file or system environment
	 * @return The API key or null if not found
	 */
	private static String getApiKey() {
		try {
			// Try to load environment variables from .env file
			Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
			return dotenv.get("SENDINBLUE_API_KEY");
		} catch (DotenvException e) {
			// Fallback to system environment variables
			return System.getenv("SENDINBLUE_API_KEY");
		}
	}
}

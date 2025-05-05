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
		// Initialize with null to handle case where .env file isn't found
		String apiKey = null;

		try {
			// Try to load environment variables from .env file
			Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
			apiKey = dotenv.get("SENDINBLUE_API_KEY");
		} catch (DotenvException e) {
			// Fallback to system environment variables
			apiKey = System.getenv("SENDINBLUE_API_KEY");
		}

		// Set the environment variable for Spring if available
		SpringApplication app = new SpringApplication(SocialmediaApplication.class);

		// Only set the property if apiKey is not null
		if (apiKey != null) {
			app.addInitializers(applicationContext -> {
				ConfigurableEnvironment env = applicationContext.getEnvironment();
				env.getSystemProperties().put("SENDINBLUE_API_KEY", apiKey);
			});
		}

		app.run(args);
	}
}

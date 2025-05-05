package com.oss.socialmedia.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    @Bean 
    public CorsConfigurationSource corsConfigurationSource() { 
        CorsConfiguration configuration = new CorsConfiguration(); 
        configuration.setAllowedOrigins(Arrays.asList(
            "http://localhost:3000",
            "https://localhost:3000",
            "http://127.0.0.1:3000",
            "https://127.0.0.1:3000",
            "https://oss-socialmedia-fe.vercel.app",
            "https://www.oss-socialmedia-fe.vercel.app"
        ));        
        configuration.setAllowedMethods(Arrays.asList(
            "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"
        )); 
        configuration.setAllowedHeaders(Arrays.asList(
            "Authorization", "Content-Type", "Accept", "X-Requested-With", "Origin"
        )); 
        configuration.setAllowCredentials(true); 
        configuration.setMaxAge(3600L); 
        // How long the response from a pre-flight request can be cached by clients 
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(); 
        source.registerCorsConfiguration("/**", configuration); // Apply this configuration to all paths 
        return source; 
    }
}

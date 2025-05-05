package com.oss.socialmedia.config;

import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String baseDir = Paths.get(System.getProperty("user.dir"), "upload").toAbsolutePath().toString();

        registry.addResourceHandler("/upload/images/**")
                .addResourceLocations("file:" + baseDir + "/images/");

        registry.addResourceHandler("/upload/videos/**")
                .addResourceLocations("file:" + baseDir + "/videos/");
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins(
                "http://localhost:3000",
                "https://localhost:3000", 
                "http://127.0.0.1:3000",
                "https://127.0.0.1:3000",
                "https://oss-socialmedia-fe.vercel.app",
                "https://www.oss-socialmedia-fe.vercel.app"
            )
            .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
            .allowedHeaders("Authorization", "Content-Type", "Accept", "X-Requested-With", "Origin")
            .allowCredentials(true)
            .maxAge(3600);
    }
}

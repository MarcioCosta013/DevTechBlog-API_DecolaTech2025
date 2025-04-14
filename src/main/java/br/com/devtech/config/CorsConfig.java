package br.com.devtech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // aceita todas as rotas
                        .allowedOrigins("http://localhost:4200") // permite o Angular
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // permite esses métodos
                        .allowedHeaders("*") // permite todos os headers
                        .allowCredentials(true); // permite cookies se você usar
            }
        };
    }
}
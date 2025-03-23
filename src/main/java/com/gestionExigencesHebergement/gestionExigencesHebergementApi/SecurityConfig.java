package com.gestionExigencesHebergement.gestionExigencesHebergementApi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  // Utilise @Configuration au lieu de @Configurable
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())  // Désactiver CSRF pour les requêtes POST, PUT, DELETE
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))  // Désactiver la gestion de session
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // Autoriser toutes les requêtes
            .build();
    }
}

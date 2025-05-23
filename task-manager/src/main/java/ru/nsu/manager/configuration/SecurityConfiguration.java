package ru.nsu.manager.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import ru.nsu.manager.data.constants.Path;
import ru.nsu.manager.filter.LongTtlJwtAuthenticationFilter;
import ru.nsu.manager.filter.ShortTtlJwtAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private static final String[] allPermittedRequests = {
        Path.AUTH_REGISTER_ENDPOINT,
        Path.AUTH_LOGIN_ENDPOINT,
        Path.AUTH_RECOVERY_INITIALIZATION_ENDPOINT,
        Path.ACTUATOR
    };

    private final ShortTtlJwtAuthenticationFilter shortTtlJwtAuthenticationFilter;

    private final LongTtlJwtAuthenticationFilter longTtlJwtAuthenticationFilter;

    private final UserDetailsService customUserDetailsService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                request -> request
                    .requestMatchers(allPermittedRequests).permitAll()
                    .anyRequest().authenticated()
            )
            .sessionManagement(
                manager -> manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )
            .csrf(AbstractHttpConfigurer::disable)
            .cors(AbstractHttpConfigurer::disable)
            .authenticationProvider(authenticationProvider())
            .addFilterBefore(shortTtlJwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
            .addFilterAfter(longTtlJwtAuthenticationFilter, ShortTtlJwtAuthenticationFilter.class)
            .build();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

        authProvider.setUserDetailsService(customUserDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}

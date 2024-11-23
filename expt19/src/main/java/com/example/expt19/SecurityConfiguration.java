package com.example.expt19;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers(  "/admin").hasRole("ADMIN")
                .requestMatchers(  "/user").hasRole("USER")
                .requestMatchers( "/").permitAll()
                .and().formLogin();
        return  http.build();




    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails x = User.withDefaultPasswordEncoder()
                .username("student")
                .password("1234")
                .roles("USER")
                .build();


        UserDetails y = User.withDefaultPasswordEncoder()
                .username("principal")
                .password("4321")
                .roles("ADMIN","USER")
                .build();

        return new InMemoryUserDetailsManager(x, y);
    }
}

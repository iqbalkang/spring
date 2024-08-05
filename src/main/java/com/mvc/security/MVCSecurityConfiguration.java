package com.mvc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class MVCSecurityConfiguration {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(customizer ->
                        customizer
                                .requestMatchers(HttpMethod.GET, "/").hasRole("EMPLOYEE")
                                .requestMatchers(HttpMethod.GET, "/leaders/**").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.GET, "/bosses/**").hasRole("ADMIN")
                                .anyRequest().authenticated())
                .formLogin(form -> form.loginPage("/login").loginProcessingUrl("/process-login").permitAll())
                .logout(logout -> logout.permitAll())
                .exceptionHandling(customizer ->
                        customizer.accessDeniedPage("/unauthorized")
                );

        return http.build();
    }




//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//        UserDetails bala = User.builder()
//                .username("bala")
//                .password("{noop}zzzzz")
//                .roles("EMPLOYEE")
//                .build();
//
//        UserDetails jeeto = User.builder()
//                .username("jeeto")
//                .password("{noop}zzzzz")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//
//        UserDetails abhi = User.builder()
//                .username("abhi")
//                .password("{noop}zzzzz")
//                .roles("EMPLOYEE", "MANAGER", "BOSS")
//                .build();
//
//        return new InMemoryUserDetailsManager(bala, jeeto, abhi);
//    }
}

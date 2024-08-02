//package com.rest.staffhub.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfiguration {
//
//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }
//
////    @Bean
////    public InMemoryUserDetailsManager userDetailsManager() {
////        UserDetails bala = User.builder()
////                .username("bala")
////                .password("{noop}zzzzzz")
////                .roles("EMPLOYEE")
////                .build();
////
////        UserDetails abhi = User.builder()
////                .username("abhi")
////                .password("{noop}zzzzzz")
////                .roles("EMPLOYEE", "MANAGER")
////                .build();
////
////        UserDetails jeeto = User.builder()
////                .username("jeeto")
////                .password("{noop}zzzzzz")
////                .roles("EMPLOYEE", "MANAGER", "ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(bala, abhi, jeeto);
////    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(customizer ->
//                customizer
//                        .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
//                );
//
//        http.httpBasic(Customizer.withDefaults());
//        http.csrf(csrf -> csrf.disable());
//
//        return http.build();
//    }
//}

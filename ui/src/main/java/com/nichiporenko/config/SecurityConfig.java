package com.nichiporenko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final KeycloakLogoutHandler keycloakLogoutHandler;

    SecurityConfig(KeycloakLogoutHandler keycloakLogoutHandler) {
        this.keycloakLogoutHandler = keycloakLogoutHandler;
    }

    @Bean
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/oauth2/**", "/login/**").permitAll()
                //.antMatchers( "/*", "/reviews*")
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .defaultSuccessUrl("/", false)
                .and().cors()
                .and()
                .logout()
                .addLogoutHandler(keycloakLogoutHandler)
                .logoutSuccessUrl("/");
                //.antMatchers("", "/oauth2/**")

//                .anyRequest().authenticated()

//                .antMatchers("/", "/login**","/callback/", "/webjars/**", "/error**")
//                .anyRequest()
//                .permitAll();
//                .authenticated();
//                .and()
//                        .formLogin();
                //.exceptionHandling()
                //.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("http://localhost:8079/auth/admin/Test_realm/console/"));
//        http.oauth2Login()
//                .defaultSuccessUrl("/", false)
//                //.successHandler(new SimpleUrlAuthenticationSuccessHandler("http://localhost:8072/ui/"))
////                .loginPage("/auth/admin/Test_realm/console/")
//                .and()
//                .logout()
//                .addLogoutHandler(keycloakLogoutHandler)
//                .logoutSuccessUrl("/");
    }

}

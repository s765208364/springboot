package com.sky.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                                .antMatchers("/level1/**").hasRole("vip1")
                                .antMatchers("/level1/**").hasRole("vip1")
                                .antMatchers("/level1/**").hasRole("vip1");
    http.formLogin();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).
                withUser("sky").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3").and().
                withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3").and().
                withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");


    }
}

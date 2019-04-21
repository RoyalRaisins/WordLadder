/*package com.example.demo;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth){
        try {
            super.configure(auth);
        }
        catch (Exception e){

        }
    }

    @Override
    protected void configure(HttpSecurity http){
        try {
            http.csrf().disable();
            super.configure(http);
        }
        catch (Exception e){

        }
    }

    @Override
    public void configure(WebSecurity web){
        try {
            super.configure(web);
        }
        catch (Exception e){

        }
    }
}

 */
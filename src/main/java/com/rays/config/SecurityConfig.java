package com.rays.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest().authenticated().and() // 要求所有进入应用的HTTP请求都要进行认证
            .formLogin().and()                  // 支持基于表单的登陆
            .httpBasic();                       // 支持Http Basic方式的认证
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        auth.inMemoryAuthentication()
            .withUser("admin").password("root").roles("ADMIN").and()
            .withUser("rays").password("1234").roles("USER","ADMIN").and();
        
    }
    
}

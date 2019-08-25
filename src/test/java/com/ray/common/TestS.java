package com.ray.common;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Configuration
class Config {
    
    @Bean
    @Profile("1")
    public String bean1() {
        System.out.println(1111111);
        return "a";
    }
    
    @Bean
    @Profile("2")
    public Integer bean2() {
        System.out.println(2222222);
        return 2;
    }
    
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles("2")
public class TestS {
    
    @Autowired
    ApplicationContext context;
    
    @org.junit.Test
    public void test123() {
        
        System.out.println(context.getBeanDefinitionNames());
        
    }
    
}

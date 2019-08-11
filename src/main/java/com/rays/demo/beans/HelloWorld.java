package com.rays.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class HelloWorld {
    
    @Component
    static class Dog { String name = "dog"; }
    
    @Component
    static class DogMaster {
        String name = "master";
        @Autowired Dog d;
        void saySomething() { System.out.printf("My name is %s, my dog's name is %s \n", name, d.name); }
    }
    
    @Configuration()
    @ComponentScan(basePackageClasses=HelloWorld.class)
    static class Config {
    }
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DogMaster dm = context.getBean(DogMaster.class);
        dm.saySomething();
        
    }

}

package com.rays.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = AOP.class)
public class AOP {
    
    @Component
    static class Dog {
        public void play() { System.out.println("Dog is playing"); }
        public void play(Object obj) { System.out.println("Dog is playing with something"); }
    }
    
    @Aspect
    @Component
    static class DogMaster {

        @DeclareParents(value="com.rays.demo.aop.AOP.Dog+", defaultImpl=SleepImpl.class)
        public Sleeper dogSleeper;
        
        @Before("execution(* com.rays.demo.aop.AOP.Dog.play(..) )  && args(Object)")
        public void beforPlaying() {
            System.out.println("master look at his dog");
        }

    }
    
    public static interface Sleeper { public void sleep(); }
    
    public static class SleepImpl implements Sleeper {

        @Override
        public void sleep() { System.out.println("sleeping"); }
        
    }
    
    public static void main(String[] args) {
              
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AOP.class);
        
        Dog d = context.getBean(Dog.class);
        
        d.play();
        d.play("毛球");
        
        Sleeper sleep = (Sleeper)d;
        sleep.sleep();
        
    }
    
}

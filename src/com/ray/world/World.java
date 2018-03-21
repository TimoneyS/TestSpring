package com.ray.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.util.io.Out;
import com.ray.world.alive.animal.Cat;
import com.ray.world.common.Sex;
import com.ray.world.factory.Factory;

public class World {
    
    @SuppressWarnings("resource")
    public void run() {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(com.ray.world.WorldConfig.class);
        
        @SuppressWarnings("unchecked")
        Factory<Cat> factory = (Factory<Cat>) context.getBean("catFactory");
        
        Out.p(factory.create("Kitty", "pink", Sex.Female));
        
        Out.p(factory.create());
        
    }
    
    public static void main(String[] args) {
        new World().run();
    }
    
}

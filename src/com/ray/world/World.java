package com.ray.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.util.io.Out;
import com.ray.world.common.Sex;
import com.ray.world.factory.alive.animal.CatFactory;

public class World {
    
    @SuppressWarnings("resource")
    public void run() {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(com.ray.world.WorldConfig.class);
        
        CatFactory factory = context.getBean(CatFactory.class);
        
        Out.p(factory.create("Kitty", "pink", Sex.Female));
        
    }
    
    public static void main(String[] args) {
        new World().run();
    }
    
}

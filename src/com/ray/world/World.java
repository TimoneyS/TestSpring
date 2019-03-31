package com.ray.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.io.Out;
import com.ray.world.common.Sex;
import com.ray.world.data.entity.alive.animal.Cat;
import com.ray.world.factory.Factory;
import com.ray.world.factory.alive.animal.CatFactory;

public class World {
    
    @SuppressWarnings("resource")
    public void run() {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(com.ray.world.WorldConfig.class);
        
        Factory<Cat> factory = context.getBean(CatFactory.class);
        
        Out.p(factory.create("Kitty", "pink", Sex.Female));
        
        Out.p(factory.create());
        
    }
    
    public static void main(String[] args) {
        new World().run();
    }
    
}

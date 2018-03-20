package com.ray.world.factory.alive.animal;

import org.springframework.stereotype.Component;

import com.ray.world.alive.animal.Cat;
import com.ray.world.common.Sex;
import com.ray.world.factory.Factory;

@Component("catFactory")
public class CatFactory implements Factory<Cat> {

    public Cat create(Object... args) {
        return new Cat((String)args[0], (String)args[1], (Sex)args[2]);
    }

    public Cat create() {
        throw new RuntimeException("Cannot create empty cat");
    }
    
}

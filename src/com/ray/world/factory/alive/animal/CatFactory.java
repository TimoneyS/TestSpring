package com.ray.world.factory.alive.animal;

import org.springframework.stereotype.Component;

import com.ray.world.alive.animal.Cat;
import com.ray.world.common.Sex;

@Component
public class CatFactory {
    
    public Cat createCat(String name, String color, Sex sex) {
        return new Cat(name, color, sex);
    }
    
}

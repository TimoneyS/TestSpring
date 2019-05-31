package com.rays.entity.old;

import org.springframework.stereotype.Component;

import com.rays.common.Log;

@Component()
@Animal
public class Dog implements Pet {
    
    String name;
    
    @Override
    public void play() {
        Log.p("Dog " + name + " playing naughty");
    }
    
    @Override
    public void eat() {
        Log.p("Dog eating");
    }

    @Override
    public void play(Pet obj) {
        Log.p("Dog " + name + " playing with Pet " + obj);
    }

    @Override
    public void play(PetMaster obj) {
        Log.p("Dog " + name + " playing with PetMaster " + obj);
    }
    
}

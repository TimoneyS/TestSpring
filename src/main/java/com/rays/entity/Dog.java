package com.rays.entity;

import org.springframework.stereotype.Component;

import com.ray.io.Out;

@Component()
@Animal
public class Dog implements Pet {
    
    String name;
    
    @Override
    public void play() {
        Out.p("Dog " + name + " playing naughty");
    }
    
    @Override
    public void eat() {
        Out.p("Dog eating");
    }

    @Override
    public void play(Pet obj) {
        Out.p("Dog " + name + " playing with Pet " + obj);
    }

    @Override
    public void play(PetMaster obj) {
        Out.p("Dog " + name + " playing with PetMaster " + obj);
    }
    
}

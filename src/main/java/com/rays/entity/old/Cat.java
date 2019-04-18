package com.rays.entity.old;

import org.springframework.stereotype.Component;

import com.ray.io.Out;

@Component
public class Cat implements Pet {

    String name;
    
    @Override
    public void play() {
        Out.p("Cat " + name + " playing quietly");
    }

    @Override
    public void eat() {
        Out.p("Cat " + name + " eating");
    }

    @Override
    @Human
    public void play(Pet obj) {
        Out.p("Cat " + name + " playing with Pet " + obj);        
    }

    @Override
    public void play(PetMaster obj) {
        Out.p("Cat " + name + " playing with PetMaster " + obj);        
    }

}

package com.rays.entity.old;

import org.springframework.stereotype.Component;

import com.rays.common.Log;

@Component
public class Cat implements Pet {

    String name;
    
    @Override
    public void play() {
        Log.p("Cat " + name + " playing quietly");
    }

    @Override
    public void eat() {
        Log.p("Cat " + name + " eating");
    }

    @Override
    @Human
    public void play(Pet obj) {
        Log.p("Cat " + name + " playing with Pet " + obj);        
    }

    @Override
    public void play(PetMaster obj) {
        Log.p("Cat " + name + " playing with PetMaster " + obj);        
    }

}

package com.rays.entity;

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

}

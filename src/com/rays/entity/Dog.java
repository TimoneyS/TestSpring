package com.rays.entity;

import org.springframework.stereotype.Component;

import com.ray.io.Out;

@Component
public class Dog implements Pet {
    
    String  name;
    
    public void play() {
        Out.p("Dog " + name + " playing naughty");
    }
    
    public void eat() {
        Out.p("Dog eating");
    }
    
}

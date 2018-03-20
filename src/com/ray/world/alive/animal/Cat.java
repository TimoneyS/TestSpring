package com.ray.world.alive.animal;

import java.util.Date;

import com.ray.world.common.DateUtil;
import com.ray.world.common.Sex;

public class Cat {
    
    private String name;
    private Sex    sex;
    private Date   birthDay;
    private String color;
    
    public Cat() {
    }
    
    public Cat(String name, String color, Sex sex) {
        this.name = name;
        this.color = color;
        this.sex = sex;
        birthDay = new Date();
    }
    
    public String getName() {
        return name;
    }
    
    public Sex getSex() {
        return sex;
    }
    
    public String getColor() {
        return color;
    }
    
    public String toString() {
        return String.format("%s is a %d years old %s %s cat", name, DateUtil.getAge(birthDay), color, sex);
    }
    
}

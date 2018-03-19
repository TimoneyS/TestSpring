package com.ray.world.object;

import java.util.Date;

import com.ray.world.common.DateUtil;

public class Cat {
    
    private String name;
    private Sex    sex;
    private Date   birthDay;
    private String color;
    
    public Cat(String name, String color, Sex sex) {
        this.name = name;
        this.color = color;
        this.sex = sex;
        birthDay = new Date();
    }
    
    public String toString() {
        return String.format("%s is a %d years old %s %s cat", name, DateUtil.getYears(birthDay), sex, color);
    }
    
}

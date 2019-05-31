package com.rays.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rays.entity.old.Listener;
import com.rays.entity.old.Pet;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestCommon {
    
    @Autowired
    ApplicationContext context;
    
    @Test
    public void test() {
        
        Pet p1 = (Pet) context.getBean("dog");
        Pet p2 = (Pet) context.getBean("cat");
        
        p1.play(p2);
        
        
        p2.play(p1);
        
        Listener l = (Listener)p1;
        l.listener();
        
    }
    
}

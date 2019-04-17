package com.rays.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.DispatcherServlet;

import com.ray.io.Out;
import com.rays.common.JavaConfig;
import com.rays.entity.Dog;
import com.rays.entity.Listener;
import com.rays.entity.Pet;
import com.rays.entity.PetMaster;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JavaConfig.class})
public class TestCommon {
    
    @Autowired
    ApplicationContext context;
    
    @Test
    public void test() {
        
        
        DispatcherServlet dispatcherServlet;
        
        Pet p1 = (Pet) context.getBean("dog");
        Pet p2 = (Pet) context.getBean("cat");
        
        p1.play(p2);
        
        Out.sep();
        
        p2.play(p1);
        
        Out.sep();
        Listener l = (Listener)p1;
        l.listener();
        
    }
    
}

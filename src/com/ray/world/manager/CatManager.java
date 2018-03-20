package com.ray.world.manager;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.ray.util.io.Out;

@Aspect
public class CatManager {
    
    public int catNum;
    
    @Before("execution(** com.ray.world.factory.alive.animal.CatFactory.create(..))")
    public void detectCatCreate() {
        Out.p("detectCatCreate");
    }
//    
//    @AfterReturning("execution(** com.ray.world.factory.Factory.create(..))")
//    public void recordCatCreate() {
//        Out.p("recordCatCreate");
//    }
//    
//    @AfterThrowing("execution(** com.ray.world.factory.Factory.create(..))")
//    public void noRecordCatCreate() {
//        Out.p("noRecordCatCreate");
//    }
//    
}

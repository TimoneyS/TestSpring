package com.ray.world.manager.alive.animal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.ray.io.Out;

@Aspect
public class CatManager {
    
    public int catNum;

    @Pointcut("execution(** com.ray.world.factory.Factory.create(..))")
    public void create() {}
    
    @Around("create()")
    public Object watchCatCreate(ProceedingJoinPoint jp) {
        
        try {
            Out.p("Cat Manager detected a cat will be created");
            Object ob = jp.proceed();
            Out.p("Cat Manager record a new cat");
            return ob;
        } catch (Throwable e) {
            Out.p("Cat Manager find the cat create failure");
        }
        
        return null;
        
    }
    
//    @Before("execution(** com.ray.world.factory.Factory.create(..))")
//    public void detectCatCreate() {
//        Out.p("Cat Manager detected a cat will be created");
//    }
//    
//    @AfterReturning("execution(** com.ray.world.factory.Factory.create(..))")
//    public void recordCatCreate() {
//        Out.p("Cat Manager record a new cat");
//    }
//    
//    @AfterThrowing("execution(** com.ray.world.factory.Factory.create(..))")
//    public void noRecordCatCreate() {
//        Out.p("Cat Manager find the cat create failure");
//    }
    
}

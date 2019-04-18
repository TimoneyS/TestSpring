package com.rays.entity.old;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.ray.io.Out;

@Aspect
@Human
public class PetMaster {
    
    @Before("execution(** com.rays.entity.Pet.play(..)) && @annotation(com.rays.entity.Human)")
    public void beforePlay() {
        Out.p("Some pet is playing, I guarantee that it will not be injured.");
    }
    
//    @AfterReturning("execution(** com.rays.entity.Pet.play(..))")
//    public void afterPlay() {
//        Out.p("Ok pet is finish playing, It has not be injured.");
//    }
//    
//    @AfterThrowing("execution(** com.rays.entity.Pet.play(..))")
//    public void afterPlayException() {
//        Out.p("Oh!!!No pet is injured, I need take it to the doctor.");
//    }
//    
//    @Around("execution(** com.rays.entity.Pet.play(..))")
//    public void aroundPlay(ProceedingJoinPoint pjp) {
//        
//        try {
//            Out.p("Another watching begin");
//            pjp.proceed();
//            Out.p("Another watching end");
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        
//    }
    
}

package com.rays.entity.old;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DogListener {
    
    @DeclareParents(value="com.rays.entity.Dog+",
            defaultImpl=CommonListener.class)
    public static Listener dogListener; 
    
}

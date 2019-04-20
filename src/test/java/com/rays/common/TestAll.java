package com.rays.common;

import org.springframework.http.MediaType;

import com.ray.io.Out;

public class TestAll {

    public static void main(String[] args) {
        
         MediaType mt = MediaType.parseMediaType("application/json;charset=UTF-8");
        
         Out.p(mt);
        
        
    }
    
}

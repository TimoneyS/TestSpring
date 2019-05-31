package com.rays.common;

import org.springframework.http.MediaType;

public class TestAll {

    public static void main(String[] args) {
        
         MediaType mt = MediaType.parseMediaType("application/json;charset=UTF-8");
        
         Log.p(mt);
        
        
    }
    
}

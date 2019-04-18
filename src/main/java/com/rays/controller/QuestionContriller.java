package com.rays.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/question")
public class QuestionContriller {

    
    @RequestMapping(method=RequestMethod.GET, value={"/{question_id}"})
    public String questionGet(@PathVariable("question_id") Long questionId) {
        
        
        
        
        return "question_page";
    }
    
    
}

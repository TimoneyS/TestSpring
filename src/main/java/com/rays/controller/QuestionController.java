package com.rays.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ray.io.Out;
import com.rays.entity.Question;
import com.rays.repository.QuestionRepository;

@Controller
@RequestMapping("/question")
public class QuestionController {

    QuestionRepository questionRepository;
    
    @Autowired
    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
        Out.p("init QuestionController");
    }
    
    @RequestMapping(method=RequestMethod.GET, value={"/form"})
    public String questionForm() {
        return "question_form";
    }
    
    @RequestMapping(method=RequestMethod.POST, value={"/create"})
    public String createForm(@Valid Question question, Errors errors, Model model) {
        
        
        Out.p(errors.hasErrors());
        
        if (errors.hasErrors()) {
            return "question_form";
        }
        
        Out.p(question.getTitle());
        Out.p(question.getDescrible());
        
        model.addAttribute("question", question);
        
        return "question_page";
    }
    
    @RequestMapping(method=RequestMethod.GET, value={"/{question_id}"})
    public String questionGet(@PathVariable("question_id") Long questionId, Model model) {
        
        Out.p("get question " + questionId);
        
        model.addAttribute("question", questionRepository.selectSingleQuestion(questionId));
        
        return "question_page";
    }
    
}

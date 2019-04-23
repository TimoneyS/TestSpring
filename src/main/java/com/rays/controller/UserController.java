package com.rays.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ray.io.Out;
import com.rays.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping(value="/reg", method=RequestMethod.GET)
    public String userReg(Model model) {
        model.addAttribute(new User());
        return "user_reg_form";
    }
    
    @RequestMapping(value="/reg", method=RequestMethod.POST)
    public String userRegPost(@Valid User user, Errors error) {
        if (error.hasErrors()) {
            return "user_reg_form"; 
        }
        
        Out.p(user.getUserTitle());
        
        return "user_main_page";
    }
    
    
}

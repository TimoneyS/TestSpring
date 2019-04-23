package com.rays.controller;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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
    public String userRegPost(@Valid User user, Errors error, @RequestPart("profilePic") MultipartFile profilePic) throws IllegalStateException, IOException {
        
        if (error.hasErrors()) {
            return "user_reg_form"; 
        }
        
        profilePic.transferTo(new File("D:\\testDirectory\\user_resources\\" + profilePic.getOriginalFilename()));
        
        return "user_main_page";
    }
    
    
}

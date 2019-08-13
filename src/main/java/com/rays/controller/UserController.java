package com.rays.controller;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rays.common.Log;
import com.rays.dao.UserDao;
import com.rays.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserDao userRepository;
    
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
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String userLogin(Model model) {
        model.addAttribute(new User());
        return "user_login_form";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String userLogin(@Valid User user, Errors error, RedirectAttributes model) throws IllegalStateException, IOException {
        if (error.hasErrors()) {
            return "user_login_form"; 
        }
        model.addFlashAttribute("user", user);
        Log.p("user login");
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return "redirect:/home";
    }
    
    
    @RequestMapping(value="/{userId}", method=RequestMethod.GET)
    public String userGet(@PathVariable Integer userId, Model model) {
        
        model.addAttribute(userRepository.selectUser(userId));
        
        return "user_main_page";
    }
    
    public String exceptionHandler() {
        
        Log.p("exceptionHandler");
        
        return "redirect:/home";
    }
    
}

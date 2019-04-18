package com.rays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ray.io.Out;

@Controller
@RequestMapping(value="/")
public class HomeController {
    
    public HomeController() {
        Out.p("init HomeController");
    }

    @RequestMapping(method=RequestMethod.GET)
    public String homePage() {
        return "home";
    }
    
}

package com.rays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rays.common.Log;

@Controller // 声明为一个控制器
@RequestMapping(value= {"/", "/home"})  // 声明处理对 "/" 的请求
public class HomeController {
    
    public HomeController() {
        Log.p("init HomeController");
    }

    @RequestMapping(method=RequestMethod.GET) // 声明处理 GET 方法
    public String homePage(Model model) {
        
        Log.p("home page");
        Log.p(model.containsAttribute("user"));
        
        return "home";  // 返回逻辑视图名称
    }
    
}

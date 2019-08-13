package com.rays.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rays.dao.QuestionDao;
import com.rays.entity.Question;

@Controller // 声明为一个控制器
@RequestMapping(value= {"/", "/home"})  // 声明处理对 "/" 的请求
public class HomeController {
    
    @Autowired
    public QuestionDao questionDao;

    @RequestMapping(method=RequestMethod.GET) // 声明处理 GET 方法
    public String homePage(Model model) {
        
        List<Question> questionList = questionDao.queryList(10);
        model.addAttribute("questionList", questionList);
        
        return "home";  // 返回逻辑视图名称
    }
    
}

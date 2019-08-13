package com.rays.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.rays.dao.QuestionDao;
import com.rays.entity.Question;

public class TestHomeController {
    
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        
        List<Question> questionList = createQuestionList(10);
        QuestionDao questionDao = Mockito.mock(QuestionDao.class);
        Mockito.when(questionDao.queryList(10)).thenReturn(questionList);
        controller.questionDao = questionDao;
        
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
        .andExpect(MockMvcResultMatchers.view().name("home"))
        .andExpect(MockMvcResultMatchers.model().attributeExists("questionList"))
        .andExpect(MockMvcResultMatchers.model().attribute("questionList", questionList));
        ;
        
    }
    
    public List<Question> createQuestionList(int num) {
        List<Question> list = new ArrayList<>(num);
        
        for (int i = 0; i < num; i++) {
            Question q = new Question();
            q.setTitle("question " + i);
            q.setId((long) i);
            q.setContent("question " + i + " describle");
            
            list.add(q);
        }
        
        return list;
    }

}

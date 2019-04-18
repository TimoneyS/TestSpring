package com.rays.common;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.ray.io.Out;
import com.rays.controller.QuestionController;
import com.rays.entity.Question;
import com.rays.repository.QuestionRepository;

public class TestQuestionController {

    @Test
    public void testQuestionGet() throws Exception {
        
        Question question = createQuestion(123l);
        QuestionRepository qr = Mockito.mock(QuestionRepository.class);
        
        qr.selectSingleQuestion(123l);
        Mockito.when(null).thenReturn(question);
        
        Out.p(qr.selectSingleQuestion(123l));
        
        QuestionController controller = new QuestionController(qr);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/views/question_page.jsp"))
                .build();
        
        mockMvc.perform(MockMvcRequestBuilders.get("/question/123"))
            .andExpect(MockMvcResultMatchers.view().name("question_page"))
            .andExpect(MockMvcResultMatchers.model().attributeExists("question"))
            .andExpect(MockMvcResultMatchers.model().attribute("question", question));
        
    }
    
    private Question createQuestion(Long id) {
        Question question = new Question(id, "Question " + id, new Date());
        return question;
    }
    
}

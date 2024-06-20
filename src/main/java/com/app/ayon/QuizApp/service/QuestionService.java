package com.app.ayon.QuizApp.service;


import com.app.ayon.QuizApp.data.QuestionsRepository;
import com.app.ayon.QuizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionsRepository questionRepository;

    public List<Question> getAllQuestions(){
       return questionRepository.findAll();
    }

}

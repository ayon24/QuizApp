package com.ayon.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayon.quizapp.data.QuestionsRepository;
import com.ayon.quizapp.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionsRepository questionsRepository;

	public List<Question> getAllQuestions(){
		return questionsRepository.findAll();
		
	}

}

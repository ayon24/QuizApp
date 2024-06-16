package com.ayon.quizapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayon.quizapp.model.Question;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Integer> {

}

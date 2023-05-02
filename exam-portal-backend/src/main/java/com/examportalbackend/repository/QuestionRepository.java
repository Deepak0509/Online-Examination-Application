package com.examportalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.Question;
import com.examportalbackend.models.Quiz;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz(Quiz quiz);
}

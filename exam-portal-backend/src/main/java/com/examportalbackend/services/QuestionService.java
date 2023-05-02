package com.examportalbackend.services;

import java.util.List;

import com.examportalbackend.models.Question;
import com.examportalbackend.models.Quiz;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestion(Long quesId);

    Question updateQuestion(Question question);

    void deleteQuestion(Long questionId);

    //Extra Methods
    List<Question> getQuestionsByQuiz(Quiz quiz);

}

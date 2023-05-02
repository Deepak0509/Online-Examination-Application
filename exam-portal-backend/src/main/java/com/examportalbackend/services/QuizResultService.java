package com.examportalbackend.services;

import java.util.List;

import com.examportalbackend.models.QuizResult;

public interface QuizResultService {
    QuizResult addQuizResult(QuizResult quizResult);
    List<QuizResult> getQuizResults();

    List<QuizResult> getQuizResultsByUser(Long userId);
}


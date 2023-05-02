package com.examportalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.QuizResult;

import java.util.List;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    List<QuizResult> findByUserId(Long userId);
}

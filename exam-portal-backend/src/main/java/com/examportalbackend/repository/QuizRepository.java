package com.examportalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.Category;
import com.examportalbackend.models.Quiz;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}

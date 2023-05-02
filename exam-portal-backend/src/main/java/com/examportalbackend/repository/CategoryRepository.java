package com.examportalbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

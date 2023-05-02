package com.examportalbackend.services;

import java.util.List;

import com.examportalbackend.models.Category;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getCategories();

    Category getCategory(Long catId);

    Category updateCategory(Category category);

    void deleteCategory(Long categoryId);
}

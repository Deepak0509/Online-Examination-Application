package com.examportalbackend.services.implementation;

import com.examportalbackend.models.Category;
import com.examportalbackend.repository.CategoryRepository;
import com.examportalbackend.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long catId) {
        return categoryRepository.findById(catId).isPresent() ? categoryRepository.findById(catId).get() : null;
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.delete(getCategory(categoryId));
    }
}

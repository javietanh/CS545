package edu.mum.service.impl;

import edu.mum.domain.Category;
import edu.mum.repository.CategoryRepository;
import edu.mum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
}

package edu.mum.service;

import edu.mum.domain.Category;

import java.util.List;

public interface CategoryService {
    Category getCategory(int id);

    List<Category> getAll();
}

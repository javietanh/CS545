package mum.edu.service;

import java.util.Map;

import mum.edu.domain.Category;

public interface CategoryService {
    
    Map<Long,Category> getAll();
    Category getOne(Long id);
 }

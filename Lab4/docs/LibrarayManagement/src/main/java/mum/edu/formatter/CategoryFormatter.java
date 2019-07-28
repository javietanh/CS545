package mum.edu.formatter;

import mum.edu.domain.Category;
import mum.edu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {

    @Autowired
    CategoryService categoryService;

    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        return categoryService.getOne(Long.valueOf(s));
//        return new Category(5L, s);
    }

    @Override
    public String print(Category category, Locale locale) {
        return null;
    }
}

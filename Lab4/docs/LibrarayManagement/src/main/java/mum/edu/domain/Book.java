package mum.edu.domain;

import java.util.List;

public class Book {

    private Long id;
    private ISBNNumber isbn;
    private String title;
    private List<Category> categories;


    public Book() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ISBNNumber getIsbn() {
        return isbn;
    }

    public void setIsbn(ISBNNumber isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}

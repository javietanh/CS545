package mum.edu.domain;

public class Book {

    private Long id;
    private String isbn;
    private String title;
    private Category category;

    public Book(long id, String isbn, String title, Category category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
    }

    public Book() {
    }

    public Book(Long id, String isbn, String title, Category category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

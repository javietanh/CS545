package mum.edu.service;

import java.util.HashMap;
import java.util.Map;

import mum.edu.domain.Book;
import org.springframework.stereotype.Service;

import mum.edu.domain.Category;

@Service
public class BookServiceImpl implements BookService {


    private Map<Long, Category> categories;
    private Map<Long, Book> books = new HashMap<>();
    private Long nextId = 1L;

    public BookServiceImpl() {
    }


    @Override
    public Map<Long, Book> getAllBooks() {
        return books;
    }

    @Override
    public Book save(Book book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    @Override
    public Book get(Long id) {
        return books.get(id);
    }

    @Override
    public Book update(Book book) {
        books.put(book.getId(), book);
        return book;
    }

}

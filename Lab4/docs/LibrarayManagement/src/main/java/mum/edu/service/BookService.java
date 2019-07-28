package mum.edu.service;

import mum.edu.domain.Book;

import java.util.Map;

public interface BookService {
    
    public Map<Long,Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(Long id);
 
}

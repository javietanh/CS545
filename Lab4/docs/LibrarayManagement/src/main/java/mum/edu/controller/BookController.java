package mum.edu.controller;

import mum.edu.domain.Book;
import mum.edu.domain.Category;
import mum.edu.domain.ISBNNumber;
import mum.edu.service.BookService;
import mum.edu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    private List<Category> getCategories(){
        Map<Long, Category> categoryMap = categoryService.getAll();
        return new ArrayList<>(categoryMap.values());
    }

    @GetMapping("/add")
    public String getBookFrom(@ModelAttribute Book book, Model model){
//        model.addAttribute("book", new Book());
//        Map<Long, Category> categoryMap = categoryService.getAll();
//        model.addAttribute("categories", getCategories());
//        model.addAttribute("categories", categoryMap);
        return "bookForm";
    }

    @GetMapping("/edit")
    public String editBook(@ModelAttribute Book book, Model model){

//        Book book = new Book();
        book.setId(8L);
        book.setTitle("CS545 WAA");
        book.setIsbn(new ISBNNumber(555, 6666, 777));

//        model.addAttribute("book", book);
        return "bookForm";
    }

    @PostMapping("/add")
    public String saveBook(Book book, Model model, BindingResult result){
//        String[] fields = result.getSuppressedFields();
//        if(fields != null){
//            throw new RuntimeException(fields[0] + " not allowed.");
//        }
//        System.out.println(book.getCategory().getId() + "---------" + book.getCategory().getName());
        for (Category category : book.getCategories()) {
            System.out.println(category.getId() + "------" +category.getName());
        }


//        model.addAttribute("categories", getCategories());
        Book savedBook = bookService.save(book);
        model.addAttribute("savedBook", savedBook);
        return "bookDetail";
    }

    @GetMapping("/list")
    public String getBookList(){
//        model.addAttribute("categories", getCategories());
        return "bookList";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
//        binder.setAllowedFields("isbn", "title", "category.id", "author", "publishDate");
    }

}

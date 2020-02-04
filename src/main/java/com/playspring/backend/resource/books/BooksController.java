package com.playspring.backend.resource.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping(value = "/books")
    public List<Book> findAll() {
        return booksService.findAllBooks();
    }

    @GetMapping(value = "/books/{id}")
    public Book findBookById(@PathVariable("id") int id) {
        return booksService.findBookById(id);
    }

}
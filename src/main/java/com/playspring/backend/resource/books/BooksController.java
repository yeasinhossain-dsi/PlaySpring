package com.playspring.backend.resource.books;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Optional<Book> findBookById(@PathVariable("id") int id) {
        return booksService.findBookById(id);
    }

    @PostMapping(value = "/books")
    public Book save(@RequestBody Book payload){                
        return booksService.save(payload);
    }

    @DeleteMapping(value = "/books/{id}")
    public Boolean remove( @PathVariable("id") int id){
        booksService.remove(id);
        return true;
    }
}
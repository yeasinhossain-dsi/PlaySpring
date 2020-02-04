package com.playspring.backend.resource.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> findAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

}
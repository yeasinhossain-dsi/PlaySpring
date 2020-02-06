package com.playspring.backend.resource.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public Optional<Book> findBookById(int id){
        return bookRepository.findById(id);
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public void remove(int id){
        bookRepository.deleteById(id);
    }

}
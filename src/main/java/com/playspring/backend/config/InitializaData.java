package com.playspring.backend.config;

import com.playspring.backend.resource.books.Book;
import com.playspring.backend.resource.books.BooksService;
import com.playspring.backend.resource.publication.Publication;
import com.playspring.backend.resource.publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InitializaData {

    private static PublicationService publicationService;
    private static BooksService booksService;

    @Autowired
    public InitializaData(PublicationService publicationService, BooksService booksService){
        this.publicationService = publicationService;
        this.booksService = booksService;
    }

    public static void populateData(){
        InitializaData.populatePublication();
    }

    private static void populatePublication(){
        if( InitializaData.publicationService.findAllPublication().size() > 0 ) return;

        String[] publications = {"Alfata Publications", "Rekha Prokashoni", "Prothoma Prokashoni"};
        Arrays.stream(publications).forEach(item -> {
            publicationService.savePublication(new Publication(item));
        });
    }

    private static void populateBooks(){
        if( InitializaData.booksService.findAllBooks().size() > 0 ) return;

        String[] publications = {"Some one is here", "Move on", "Attick Attack"};
        Arrays.stream(publications).forEach(item -> {
            booksService.save( new Book(  ));
        });
    }

}

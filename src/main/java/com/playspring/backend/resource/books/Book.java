package com.playspring.backend.resource.books;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @NotNull
    String book_name;
    @NotNull
    String author_name;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    Publication publication;

    public Book() {
    }

    public Book(int id, String book_name, String author_name) {
        this.id = id;
        this.book_name = book_name;
        this.author_name = author_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    @Override
    public String toString() {
        return "Book [author_name=" + author_name + ", book_name=" + book_name + ", id=" + id + "]";
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    

}
package com.playspring.backend.resource.books;

import org.springframework.data.repository.CrudRepository;;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
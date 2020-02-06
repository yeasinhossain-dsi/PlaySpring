package com.playspring.backend.resource.books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publication{


    @Id
    int id;
    String name;

    public Publication() {
    }

    public Publication(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
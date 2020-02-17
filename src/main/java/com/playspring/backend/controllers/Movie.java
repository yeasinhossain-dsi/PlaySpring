package com.playspring.backend.controllers;

import javax.persistence.Entity;

public class Movie {

    private int id;
    private String movie_title;
    private String movie_director;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_director() {
        return movie_director;
    }

    public void setMovie_director(String movie_director) {
        this.movie_director = movie_director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movie_title='" + movie_title + '\'' +
                ", movie_director='" + movie_director + '\'' +
                '}';
    }
}

package com.playspring.backend.resource.Movies;

import com.playspring.backend.controllers.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    RestTemplate restTemplate;

    @Async
    public void getMovie() throws Exception{
        Movie movie = restTemplate.getForObject("http://localhost:420/movies", Movie.class);
        if( null == movie ) throw new Exception("Movie not found");
        System.out.println(movie);
    }

}

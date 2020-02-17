package com.playspring.backend.resource.Movies;


import com.playspring.backend.controllers.Movie;
import javassist.bytecode.stackmap.BasicBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rest")
public class MoviesController {

    @Autowired
    MovieService movieService;

    @RequestMapping("")
    public String getmovies() {
        try{
            for(int i = 0; i < 5; i++){
                movieService.getMovie();
            }
            return "Movies";
        }
        catch(Exception ex){
            System.out.println("++++++++++++" + ex.getMessage());
        }
        return "";
    }
}

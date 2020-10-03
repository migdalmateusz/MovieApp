package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class Create
{
    List<Movie> movieRepository = new ArrayList<>();
    @PostMapping("/movies")
    public void createMovie(@RequestBody String title, Integer id )
    {
        Movie movie = new Movie("Top Gun", 1);
        movieRepository.add(movie);
    }
}

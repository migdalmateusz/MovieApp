package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Create
{
    public static Map<Integer, Movie> movieRepository = new HashMap();
    public Integer currentId = 0;
    @PostMapping("/movies")
    public void createMovie(@RequestBody Movie movie)
    {
        movieRepository.put(currentId, movie);
        currentId = currentId + 1;
    }
}

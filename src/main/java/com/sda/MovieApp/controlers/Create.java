package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Create
{
    @PostMapping("/movies")
    public void createMovie(@RequestBody String title, Integer id )
    {
        Movie movie = new Movie("Top Gun");
    }
}

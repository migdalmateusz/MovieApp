package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.*;
import static com.sda.MovieApp.controlers.Create.movieRepository;

@RestController
public class Delete
{
    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable(value = "id") Integer id)
    {
        movieRepository.remove(id);
    }
}
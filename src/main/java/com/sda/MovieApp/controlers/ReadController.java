package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadController {

    @GetMapping("/movies/{id}")
    public Movie readMovie (@PathVariable(value = "id") Integer id) {
        return Create.movieRepository.get(id);
    }
}

package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Modification {

    @PutMapping("/movies/{id}")
    public void modificationMovie (@PathVariable(value = "id") Integer id, @RequestBody String title) {
        Create.movieRepository.get(id).setTitle(title);
    }
}

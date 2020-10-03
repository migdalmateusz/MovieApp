package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MovieController {

    @PostMapping("/movies")
    public void createMovie(@RequestBody Movie movie) {
        MovieRepository.movieRepository.put(MovieRepository.currentId, movie);
        movie.setId(MovieRepository.currentId);
        MovieRepository.currentId = MovieRepository.currentId + 1;
    }

    @GetMapping("/movies/{id}")
    public Movie readMovie (@PathVariable(value = "id") Integer id) {
        return MovieRepository.movieRepository.get(id);
    }

    @GetMapping("/movies")
    public Map readMovie ()
    {
        return MovieRepository.movieRepository;
    }

    @PutMapping("/movies/{id}")
    public void modificationMovie (@PathVariable(value = "id") Integer id, @RequestBody String title) {
        MovieRepository.movieRepository.get(id).setTitle(title);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable(value = "id") Integer id)
    {
        MovieRepository.movieRepository.remove(id);
    }
}


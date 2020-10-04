package com.sda.MovieApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping("/movies")
    public void createMovie(@RequestBody Movie movie) {
        boolean movieExist = false;
        for (int i=0; i<movieRepository.movieRepository.size();i++) {
            if (movieRepository.movieRepository.get(i).getTitle().equals(movie.getTitle())) {
                movieExist = true;
            }
        }
        if (movieExist) {
            throw new MovieConflictExceptions("This movie already exist");
        } else {
            movieRepository.movieRepository.put(movieRepository.currentId, movie);
            movie.setId(movieRepository.currentId);
            movieRepository.currentId = movieRepository.currentId + 1;
        }
    }

    @GetMapping("/movies/{id}")
    public Movie readMovie(@PathVariable(value = "id") Integer id) {
        if (movieRepository.movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions("There is no movie");
        } else {
            return movieRepository.movieRepository.get(id);
        }
    }

    @GetMapping("/movies")
    public Map readMovie() {
        return movieRepository.movieRepository;
    }

    @PutMapping("/movies/{id}")
    public void modificationMovie(@PathVariable(value = "id") Integer id, @RequestBody String title) {
        if (movieRepository.movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions("There is no movie");
        } else {
            movieRepository.movieRepository.get(id).setTitle(title);
        }
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable(value = "id") Integer id) {
        if (movieRepository.movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions("There is no movie");
        } else {
            movieRepository.movieRepository.remove(id);
        }
    }
}


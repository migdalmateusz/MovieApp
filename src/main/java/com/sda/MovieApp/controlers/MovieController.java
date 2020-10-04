package com.sda.MovieApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MovieController {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping("/movies")
    @ResponseBody
    public void createMovie(@RequestBody Movie movie) throws MovieConflictExceptions {
        movieRepository.addMovie(movie);
    }

    @ResponseStatus(value = HttpStatus.CONFLICT)
    @ExceptionHandler(MovieConflictExceptions.class)
    @ResponseBody
    public String conflict() {
        return "Movie is already exist";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MovieNotFoundExceptions.class)
    @ResponseBody
    public String notFound() {
        return "Movie is not exist";
    }

    @GetMapping("/movies/{id}")
    @ResponseBody
    public Movie readMovie(@PathVariable(value = "id") Integer id) throws MovieNotFoundExceptions {
        return movieRepository.readMovie(id);
    }

    @GetMapping("/movies")
    @ResponseBody
    public Map readMovie() {
        return movieRepository.readAll();
    }

//    private static final String movie = "movies";
//
//    @GetMapping("/movies")
//    public String readMovie(final ModelMap modelMap) {
//        modelMap.addAttribute(movie, movieRepository.movieRepository.get(0));
//        return "mainPage";
//    }
//
    @PutMapping("/movies/{id}")
    public void modificationMovie(@PathVariable(value = "id") Integer id, @RequestBody String title) throws MovieNotFoundExceptions {
        movieRepository.changeMovie(id, title);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable(value = "id") Integer id) throws MovieNotFoundExceptions {
        movieRepository.deleteMovie(id);
    }
}
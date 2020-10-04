package com.sda.MovieApp.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MovieNotFoundExceptions extends RuntimeException {
    public MovieNotFoundExceptions(String message) {
        super(message);
    }
}

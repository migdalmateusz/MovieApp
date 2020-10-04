package com.sda.MovieApp.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "This movie already exist")
public class MovieConflictExceptions extends RuntimeException
{
    public MovieConflictExceptions(String message)
    {
        super(message);
    }
}
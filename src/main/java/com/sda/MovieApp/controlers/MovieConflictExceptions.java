package com.sda.MovieApp.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class MovieConflictExceptions extends RuntimeException
{
    public MovieConflictExceptions(String message)
    {
        super(message);
    }
}
package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadController {

    @GetMapping("/movies/{id}")
    public Movie readMovie {
    }


}

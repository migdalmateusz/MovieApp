package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.sda.MovieApp.controlers.Create.movieRepository;

@RestController
public class ReadAll
{
    @GetMapping("/movies")
    public void readMovie (@RequestParam(value = "id") Integer id)
    {
        for(id = 0; id < movieRepository.size(); id++ )
        {
            System.out.println(movieRepository.get(id));
        }
    }
}




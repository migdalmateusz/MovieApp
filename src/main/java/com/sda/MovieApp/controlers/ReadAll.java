package com.sda.MovieApp.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.sda.MovieApp.controlers.Create.movieRepository;

@RestController
public class ReadAll
{
    @GetMapping("/movies")
    public void readMovie (@RequestBody Movie movie)
    {
        for(int i=0; i<movieRepository.size(); i++ )
        {
            System.out.println(movieRepository.get(i));
        }
    }
}




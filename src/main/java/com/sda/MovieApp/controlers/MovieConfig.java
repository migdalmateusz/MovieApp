package com.sda.MovieApp.controlers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    public MovieRepository getMovieRepository () {
        MovieRepository movieRepository = new MovieRepository();
        return movieRepository;
    }
}

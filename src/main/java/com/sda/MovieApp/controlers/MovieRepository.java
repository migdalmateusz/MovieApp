package com.sda.MovieApp.controlers;

import java.util.*;

public class MovieRepository {

    private Map<Integer, Movie> movieRepository = new HashMap();
    private Integer currentId = 0;

    public void addMovie (Movie movie) throws MovieConflictExceptions {
        boolean movieExist = false;
        for (int i = 0; i < movieRepository.size(); i++) {
            if (movieRepository.get(i).getTitle().equals(movie.getTitle())) {
                movieExist = true;
            }
        }
        if (movieExist) {
            throw new MovieConflictExceptions();
        } else {
            movieRepository.put(currentId, movie);
            movie.setId(currentId);
            currentId = currentId + 1;
        }
    }

    public Movie readMovie (Integer id) throws MovieNotFoundExceptions {
        if (movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions();
        } else {
            return movieRepository.get(id);
        }
    }

    public Collection<Movie> readAll () {
        return List.copyOf(movieRepository.values());
    }

    public void changeMovie (Integer id, String title) throws MovieNotFoundExceptions {
        if (movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions();
        } else {
            movieRepository.get(id).setTitle(title);
        }
    }

    public void deleteMovie (Integer id) throws MovieNotFoundExceptions {
        if (movieRepository.get(id) == null) {
            throw new MovieNotFoundExceptions();
        } else {
            movieRepository.remove(id);
        }
    }
}

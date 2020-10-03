package com.sda.MovieApp.controlers;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {

    public Map<Integer, Movie> movieRepository = new HashMap();
    public Integer currentId = 0;
}

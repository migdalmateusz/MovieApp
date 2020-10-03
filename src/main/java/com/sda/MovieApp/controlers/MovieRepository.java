package com.sda.MovieApp.controlers;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {

    public static Map<Integer, Movie> movieRepository = new HashMap();
    public static Integer currentId = 0;
}

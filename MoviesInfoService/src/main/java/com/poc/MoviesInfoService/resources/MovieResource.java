package com.poc.MoviesInfoService.resources;

import com.poc.MoviesInfoService.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    ConcurrentMap<String, Movie> movieConcurrentMap = new ConcurrentHashMap<>();


    @GetMapping("/getMovieInfo/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
        return movieConcurrentMap.get(movieId);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {

        return new ArrayList<Movie>(movieConcurrentMap.values());
    }

    @PostMapping("/addMovieInfo")
    public Movie addMovieInfo(@RequestBody Movie movie) {
        movieConcurrentMap.put(movie.getMovieId(), movie);
        return movie;
    }

}

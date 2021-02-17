package com.poc.MoviesCatalogService.resources;

import com.poc.MoviesCatalogService.model.CatalogItem;
import com.poc.MoviesCatalogService.model.Movie;
import com.poc.MoviesCatalogService.model.Rating;
import com.poc.MoviesCatalogService.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {

        //get all movie IDs
        UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratings/getUserRating/"+userId, UserRating.class);
        //for each movie, get the movie info service and get details

        return userRating.getUserRating().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/getMovieInfo/" + rating.getMovieId(), Movie.class);

            /*Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8090/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();*/

            return new CatalogItem(movie.getMovieName(), movie.getMovieDesc(), rating.getRating());

        }).collect(Collectors.toList());

        //put them all together


    }
}

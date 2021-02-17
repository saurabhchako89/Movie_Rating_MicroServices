package com.poc.RatingsDataService.resources;

import com.poc.RatingsDataService.model.Rating;
import com.poc.RatingsDataService.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/getRating/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {

        return new Rating("10", movieId);
    }

    @RequestMapping("/getUserRating/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {

        List<Rating> ratings = Arrays.asList(
                new Rating("9", "1"),
                new Rating("8", "2"),
                new Rating("10", "3")
        );

        return new UserRating(ratings);
    }
}

package com.poc.RatingsDataService.model;

public class Rating {
    private String rating;
    private String movieId;

    public Rating(String rating, String movieId) {
        this.rating = rating;
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating='" + rating + '\'' +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}

package com.poc.MoviesCatalogService.model;

public class CatalogItem {

    private String movieName;
    private String description;
    private String rating;

    public CatalogItem() {
    }

    public CatalogItem(String movieName, String description, String rating) {
        this.movieName = movieName;
        this.description = description;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "movieName='" + movieName + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

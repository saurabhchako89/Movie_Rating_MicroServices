package com.poc.MoviesCatalogService.model;

import java.util.List;

public class UserRating {
    private List<Rating> userRating;

    public UserRating() {
    }

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    @Override
    public String toString() {
        return "UserRating{" +
                "userRating=" + userRating +
                '}';
    }
}

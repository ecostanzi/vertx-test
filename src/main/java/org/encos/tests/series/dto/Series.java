package org.encos.tests.series.dto;

/**
 * @author Enrico Costanzi
 */
public class Series {

    private String title;

    private double rating;

    public Series(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

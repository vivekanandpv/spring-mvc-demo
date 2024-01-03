package com.vivekanandpv.springmvcdemo.models;

public class News {
    private final String country;
    private final int year;

    public News(String country, int year) {
        this.country = country;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }
}

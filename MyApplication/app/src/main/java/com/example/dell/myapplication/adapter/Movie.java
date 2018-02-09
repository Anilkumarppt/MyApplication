package com.example.dell.myapplication.adapter;

/**
 * Created by Dell on 09-02-2018.
 */

public class Movie {
    private String title, gener, year;

    public Movie() {

    }

    public Movie(String title, String gener, String year) {
        this.title = title;
        this.gener = gener;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

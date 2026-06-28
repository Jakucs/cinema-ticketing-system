package com.codecool;

public class Movie {
    private String title;
    private Genre genre;
    private int duration;

    public Movie(String title, Genre genre, int duration){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public Genre getGenre(){
        return genre;
    }

    public double getDuration(){
        return duration;
    }
}
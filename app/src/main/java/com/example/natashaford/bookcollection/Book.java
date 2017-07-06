package com.example.natashaford.bookcollection;


/**
 * Created by natashaford on 05/07/2017.
 */

public class Book {

    private int ranking;
    private String title;
    private String author;
    private int year;
    private Integer image;

    public Book(Integer ranking, String title, String author, Integer year, Integer image) {
        this.ranking = ranking;
        this.title = title;
        this.author = author;
        this.year = year;
        this.image = image;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getImage(){
        return image;
    }


}

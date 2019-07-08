package com.stefanalexnovak.springhibernatelibraryapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Books")
public class Book extends BaseEntity{

    private String title;
    private String author;
    private String genre;
    private String location;
    private String special;

    public Book(){}

    public String toString() {
        return "Book(Title: " + this.title + ", Author: " + this.author + ", Genre: " + this.genre + ", Location: " + this.location + ", Note: " + this.special + ")";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}

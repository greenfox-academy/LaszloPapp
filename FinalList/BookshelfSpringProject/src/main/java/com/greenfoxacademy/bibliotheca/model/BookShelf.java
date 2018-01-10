package com.greenfoxacademy.bibliotheca.model;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.websocket.Encoder;
import javax.xml.soap.Text;

@Entity
public class BookShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    public String title;
    public String author;
    public String description;

    @Column(name = "longDescription")
    @Type(type="text")
    public String longDescription;
    public String isbn;
    public String year;
    public Boolean favourite;
    public int score;


    public BookShelf(String title, String author, String description, String isbn, String year, int score, String longDescription) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.year = year;
        this.score = score;
        this.longDescription = longDescription;
    }

    public BookShelf() {
    }

    public BookShelf(Boolean favourite) {
        this.favourite = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}

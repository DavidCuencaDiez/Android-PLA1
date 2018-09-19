package com.example.david.pla1.model;

import java.util.Date;

public class BookItem {

    private int id;
    private String title;
    private String author;
    private Date publication;
    private String description;
    private String imageURL;

    public BookItem(int id, String title, String author, Date publication, String description, String imageURL) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.description = description;
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}


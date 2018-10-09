package com.example.david.pla1.model;

import com.google.firebase.database.Exclude;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookItem {

    private int id;
    private String author;
    private String description;
    private Date publication_date;
    private String title;
    private String url_image;

    public BookItem() {
// Default constructor required for calls to DataSnapshot.getValue(BookItem.class)
    }

    public BookItem(int id, String author, String description, Date publication_date, String title, String url_image) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.publication_date = publication_date;
        this.title = title;
        this.url_image = url_image;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", id);
        result.put("author", author);
        result.put("description", description);
        result.put("publication_date", publication_date);
        result.put("title", title);
        result.put("url_image", url_image);

        return result;
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
        return publication_date;
    }

    public void setPublication(Date publication) {
        this.publication_date = publication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return url_image;
    }

    public void setImageURL(String imageURL) {
        this.url_image = imageURL;
    }
}


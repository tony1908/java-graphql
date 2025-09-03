package com.example;

public class Property {
    private int id;
    private String image;
    private String title;
    private String type;
    private String location;
    private String details;
    private String host;
    private int price;
    private int rating;

    public Property() {}

    public Property(int id, String image, String title, String type, String location, 
                   String details, String host, int price, int rating) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.type = type;
        this.location = location;
        this.details = details;
        this.host = host;
        this.price = price;
        this.rating = rating;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}
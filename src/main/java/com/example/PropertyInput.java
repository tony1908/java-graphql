package com.example;

public class PropertyInput {
    private String image;
    private String title;
    private String type;
    private String location;
    private String details;
    private String host;
    private int price;
    private int rating;

    public PropertyInput() {}

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
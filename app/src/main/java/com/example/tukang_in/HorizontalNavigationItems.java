package com.example.tukang_in;

public class HorizontalNavigationItems {
    private int imageResource;
    private String description;

    public HorizontalNavigationItems(int imageResource, String description){
        this.imageResource = imageResource;
        this.description = description;

    }
    public int getImageResource() {
        return imageResource;
    }

    public String getDescription() {
        return description;
    }
}

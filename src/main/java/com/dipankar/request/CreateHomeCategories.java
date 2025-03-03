package com.dipankar.request;

import lombok.Data;


public class CreateHomeCategories {
    private String categoryId;
    private String name;
    private String image;

    public CreateHomeCategories() {
    }

    public CreateHomeCategories(String categoryId, String name, String image) {
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

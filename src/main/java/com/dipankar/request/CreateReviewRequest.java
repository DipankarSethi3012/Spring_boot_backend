package com.dipankar.request;

import lombok.Data;

import java.util.List;


public class CreateReviewRequest {
    private String reviewText;
    private double reviewRating;
    private List<String> productImages;

    public CreateReviewRequest() {
    }

    public CreateReviewRequest(String reviewText, double reviewRating, List<String> productImages) {
        this.reviewText = reviewText;
        this.reviewRating = reviewRating;
        this.productImages = productImages;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public double getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(double reviewRating) {
        this.reviewRating = reviewRating;
    }

    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }
}

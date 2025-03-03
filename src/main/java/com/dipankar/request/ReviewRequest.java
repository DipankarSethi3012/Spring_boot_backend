package com.dipankar.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ReviewRequest {
	
	private Long productId;
	private String review;

	public ReviewRequest() {
	}

	public ReviewRequest(Long productId, String review) {
		this.productId = productId;
		this.review = review;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
}

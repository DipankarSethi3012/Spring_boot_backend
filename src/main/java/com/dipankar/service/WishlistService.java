package com.dipankar.service;


import com.dipankar.exception.WishlistNotFoundException;
import com.dipankar.model.Product;
import com.dipankar.model.User;
import com.dipankar.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}


package com.dipankar.service;

import com.dipankar.exception.ProductException;
import com.dipankar.model.Cart;
import com.dipankar.model.CartItem;
import com.dipankar.model.Product;
import com.dipankar.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}

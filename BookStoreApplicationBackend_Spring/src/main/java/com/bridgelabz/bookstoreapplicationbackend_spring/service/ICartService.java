package com.bridgelabz.bookstoreapplicationbackend_spring.service;

import com.bridgelabz.bookstoreapplicationbackend_spring.dto.CartDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.dto.CartListDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;

import java.util.List;

public interface ICartService {

	// to add book to cart
	Response addToCart(String token, CartDTO cartDto);
	

	// to remove product from cart
	Response removeCartItem(String token, long cartId);

	// to update item's quantity in cart
	Response updateCartItem(String token, CartDTO cartDto);

	// To get all cart by user
	List<CartListDTO> getUserCart(String token);

}

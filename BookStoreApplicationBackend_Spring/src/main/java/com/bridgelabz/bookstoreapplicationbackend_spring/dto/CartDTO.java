package com.bridgelabz.bookstoreapplicationbackend_spring.dto;

import lombok.Data;

public @Data class CartDTO 
{

    private long bookId;
	
	private int quantity;
}

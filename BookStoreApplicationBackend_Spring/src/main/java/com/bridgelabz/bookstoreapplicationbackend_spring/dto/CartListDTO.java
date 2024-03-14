package com.bridgelabz.bookstoreapplicationbackend_spring.dto;

import com.bridgelabz.bookstoreapplicationbackend_spring.entity.BookEntity;
import lombok.Data;

@Data
public class CartListDTO {
	
	BookEntity book;
	
	int quantity;
	
	long id;
	
	long userId;
	
	public CartListDTO() {
		
	}

}

package com.bridgelabz.bookstoreapplicationbackend_spring.dto;

import java.time.LocalDate;
import com.bridgelabz.bookstoreapplicationbackend_spring.entity.UserEntity;
import lombok.Data;
@Data
public class OrderList {

	UserEntity user;
	
	long id;
	
    private int quantity;
	
	private double price;
	
	private long bookId;
	
	private String address;
	
	private LocalDate orderDate;
	
	public OrderList() {
		
	}
}

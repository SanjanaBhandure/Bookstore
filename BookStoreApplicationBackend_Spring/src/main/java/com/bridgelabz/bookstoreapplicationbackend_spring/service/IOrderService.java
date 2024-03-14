package com.bridgelabz.bookstoreapplicationbackend_spring.service;

import com.bridgelabz.bookstoreapplicationbackend_spring.dto.OrderDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.dto.OrderList;
import com.bridgelabz.bookstoreapplicationbackend_spring.entity.OrderEntity;
import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;

import java.util.List;

public interface IOrderService {

	// To place an order
	//Response placeOrder(String token, OrderDTO orderDTO);

	Response placeOrder(String token, OrderDTO orderDTO);

	// To cancel placed order
	Response cancelOrder(String token, long orderId);

	// To get all orders placed
	List<OrderEntity> getAllOrders(String token);

	// To get all order placed by user
	List<OrderList> getUserOrders(String token);

}

package com.example.order.service;

import java.util.List;

import com.example.order.entity.Order;

public interface OrderService {
	
	void save(Order order);
	List<Order> findAll();
	Order findById(int id);
	void deleteById(int id);

}

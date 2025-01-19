package com.example.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@PostMapping("/order")
	void Create(@RequestBody Order order)
	{
		orderservice.save(order);
	}
	
	@GetMapping("/order")
	List<Order> Read()
	{
		return orderservice.findAll();	
	}
	
	@GetMapping("/order/{id}")
	Order ReadById(@PathVariable int id)
	{
		return orderservice.findById(id);	
	}
	
	@PutMapping("/order/{id}")
	void Update(@RequestBody Order order, @PathVariable int id)
	{
		order.setId(id);
		orderservice.save(order);
	}
	
	@DeleteMapping("/order/{id}")
	void Delete(@PathVariable int id)
	{
		orderservice.deleteById(id);
	}
	

}

package com.example.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.entity.Payment;
import com.example.payment.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/pay")
	void Create(@RequestBody Payment payment)
	{
		paymentService.save(payment);
		System.out.println("Created....");
	}
	
	@GetMapping("/pay")
	List<Payment> Read()
	{
		return paymentService.findAll();
	}
	
	@GetMapping("/pay/{id}")
	Payment ReadById(@PathVariable int id)
	{
		return paymentService.findById(id);
	}
	
	@PutMapping("/pay/{id}")
	void Update(@RequestBody Payment payment, @PathVariable int id)
	{
		payment.setId(id);
		paymentService.save(payment);
		System.out.println("Updated....");

	}
	
	@DeleteMapping("/pay/{id}")
	void Delete(@PathVariable int id)
	{
		paymentService.deleteById(id);
		System.out.println("Deleted....");

	}
	

}

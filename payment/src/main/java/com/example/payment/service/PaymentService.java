package com.example.payment.service;

import java.util.List;

import com.example.payment.entity.Payment;

public interface PaymentService {
	
	void save(Payment payment);
	List<Payment> findAll();
	Payment findById(int id);
	void deleteById(int id);

}

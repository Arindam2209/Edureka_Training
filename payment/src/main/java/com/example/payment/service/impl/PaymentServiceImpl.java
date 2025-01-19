package com.example.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment.entity.Payment;
import com.example.payment.repository.PaymentRepo;
import com.example.payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;

	@Override
	public void save(Payment payment) {
		paymentRepo.save(payment);
	}

	@Override
	public List<Payment> findAll() {
		return paymentRepo.findAll();
	}

	@Override
	public Payment findById(int id) {
		return paymentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		paymentRepo.deleteById(id);
	}

}

package com.example.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.order.dto.PaymentDTO;
import com.example.order.entity.Order;
import com.example.order.repository.OrderRepo;
import com.example.order.service.OrderService;

@Service
public class OrdderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public void save(Order order) {
		orderRepo.save(order);
		String url="http://localhost:8080/pay";
		PaymentDTO paymentDTO=new PaymentDTO(order.getId(),order.getOrderAmount());
		ResponseEntity<PaymentDTO> resp=restTemplate.postForEntity(url, paymentDTO, PaymentDTO.class);
//		ResponseEntity<PaymentDTO[]> resp1=restTemplate.getForObject(url, PaymentDTO[].class);		
		System.out.println(resp);
		if(resp.getStatusCode()==HttpStatus.OK) {
			order.setOrderStatus("Completed");
			orderRepo.save(order);
		}
		
		else
		{
			order.setOrderStatus("Failed...Please Pay again!!!");
			orderRepo.save(order);
		}
		
		
	}

	@Override
	public List<Order> findAll() {
		String url="http://localhost:8080/pay";
		PaymentDTO[] payment= restTemplate.getForObject(url, PaymentDTO[].class);
		for(PaymentDTO pay:payment) {
			System.out.println(pay.toString());
		}
		return orderRepo.findAll();
		
	}

	@Override
	public Order findById(int id) {
		return orderRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		orderRepo.deleteById(id);
	}

}

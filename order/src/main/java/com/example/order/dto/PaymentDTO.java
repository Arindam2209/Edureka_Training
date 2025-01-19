package com.example.order.dto;

public class PaymentDTO {
	
	int orderId;
	double totalAmount;
	
	
	public PaymentDTO(int orderId, double totalAmount) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	@Override
	public String toString() {
		return "PaymentDTO [orderId=" + orderId + ", totalAmount=" + totalAmount + "]";
	}
	
	
	
	

}

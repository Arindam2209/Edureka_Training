package com.example.payment.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_table")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="order_id")
	int orderId;
	
	@Column(name="total_amount")
	double totalAmount;
	
	@Column(name="time")
	LocalTime paymentTime;
	
	@Column(name="date")
	LocalDate paymentDate;


	public Payment(int orderId, double totalAmount, LocalTime paymentTime, LocalDate paymentDate) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.paymentTime = LocalTime.now();
		this.paymentDate = LocalDate.now();
	}


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
		this.paymentTime = LocalTime.now();
		this.paymentDate = LocalDate.now();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public LocalTime getPaymentTime() {
		return paymentTime;
	}


	public void setPaymentTime(LocalTime paymentTime) {
		this.paymentTime = paymentTime;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}


	@Override
	public String toString() {
		return "Payment [id=" + id + ", orderId=" + orderId + ", totalAmount=" + totalAmount + ", paymentTime="
				+ paymentTime + ", paymentDate=" + paymentDate + "]";
	}
	
	

}

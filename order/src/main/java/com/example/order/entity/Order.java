package com.example.order.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="order_description")
	String orderDescription;
	
	@Column(name="order_status")
	String orderStatus;
	
	@Column(name="order_amount")
	double orderAmount;
	
	@Column(name="order_date")
	LocalDate orderDate;

	public Order() {
		super();
		this.orderDate=LocalDate.now();
	}

	public Order(String orderDescription, String orderStatus, double orderAmount) {
		super();
		this.orderDescription = orderDescription;
		this.orderStatus = orderStatus;
		this.orderAmount = orderAmount;
		this.orderDate = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDescription=" + orderDescription + ", orderStatus=" + orderStatus
				+ ", orderAmount=" + orderAmount + ", orderDate=" + orderDate + "]";
	}
	
	

}

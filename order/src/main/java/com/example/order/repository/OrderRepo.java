package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}

package com.pharmacy.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		return orderRepository.findAll();

	}

	public Optional<Order> getOrder(Integer id) {
		return orderRepository.findById(id);
	}

	public void createOrder(Order order) {
		orderRepository.save(order);

	}

	public void updateOrder(Order order) {
		orderRepository.save(order);
	}

	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	}
}

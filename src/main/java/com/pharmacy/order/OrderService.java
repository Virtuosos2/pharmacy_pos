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
		List<Order> order = new ArrayList<>();
		orderRepository.findAll().forEach(order::add);
		return order;

	}

	public Optional<Order> getProduct(Integer id) {
		return orderRepository.findById(id);
	}

	public void addProduct(Order product) {
		orderRepository.save(product);

	}

	public void updateProduct(Order product) {
		orderRepository.save(product);
	}

	public void deleteProduct(Integer id) {
		orderRepository.deleteById(id);
	}
}

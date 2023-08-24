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
	private OrderRepository purchaseRepository;

	public List<Order> getAllPurchase() {
		List<Order> purchase = new ArrayList<>();
		purchaseRepository.findAll().forEach(purchase::add);
		return purchase;

	}

	public Optional<Order> getProduct(Integer id) {
		return purchaseRepository.findById(id);
	}

	public void addProduct(Order product) {
		purchaseRepository.save(product);

	}

	public void updateProduct(Order product) {
		purchaseRepository.save(product);
	}

	public void deleteProduct(Integer id) {
		purchaseRepository.deleteById(id);
	}
}

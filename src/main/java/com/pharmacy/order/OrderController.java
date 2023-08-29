package com.pharmacy.order;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/order")
	public List<Order> orderDetails() {
		return orderService.getAllOrders();

	}

	@GetMapping("/order/{id}")
	public Optional<Order> getorder(@PathVariable Integer id) {
		return  orderService.getProduct(id);
	}


	@PostMapping("/order")
	public String addProduct(@RequestBody Order product) { 
		orderService.addProduct(product);
		return "Product Added Sucessfully";

	}

	@PutMapping("/order")
	public String updateProduct( @RequestBody Order product ) {
		orderService.updateProduct(product);
		return "Product Updated Successfully";
		
	}

	@DeleteMapping("/order/{id}")
	public void deletePurchase(@PathVariable Integer id) {
	orderService.deleteProduct(id);
	}

}

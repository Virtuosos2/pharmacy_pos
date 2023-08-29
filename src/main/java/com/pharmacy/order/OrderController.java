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
		return  orderService.getOrder(id);
	}


	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) { 
		orderService.createOrder(order);
		return "order created Sucessfully";

	}

	@PutMapping("/order")
	public String updateOrder( @RequestBody Order order ) {
		orderService.updateOrder(order);
		return "Order Updated Successfully";
		
	}

	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable Integer id) {
	orderService.deleteOrder(id);
	}

}

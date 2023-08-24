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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderService purchaseService;

	@GetMapping("/purchase")
	public List<Order> PurchaseDetails() {
		return purchaseService.getAllPurchase();

	}

	@GetMapping("/purchase/{id}")
	public Optional<Order> getPurchase(@PathVariable Integer id) {
		return  purchaseService.getProduct(id);
	}


	@PostMapping("/purchase")
	public String addProduct(@RequestBody Order product) { 
		purchaseService.addProduct(product);
		return "Product Added Sucessfully";

	}

	@PutMapping("/purchase")
	public String updateProduct( @RequestBody Order product ) {
		purchaseService.updateProduct(product);
		return "Product Updated Successfully";
		
	}

	@DeleteMapping("/purchase/{id}")
	public void deletePurchase(@PathVariable Integer id) {
		purchaseService.deleteProduct(id);
	}

}

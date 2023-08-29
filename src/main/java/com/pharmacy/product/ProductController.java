package com.pharmacy.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacy.order.Order;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> ProductDetails() {
		return productService.getAllProduct();
	}

	@PostMapping("product")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "Product Added Sucessfully";

	}
}

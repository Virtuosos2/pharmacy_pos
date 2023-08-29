package com.pharmacy.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.pharmacy.order.Order;

public class ProductController {


private ProductService productService;
	
	@GetMapping("/product")
	public List<Product> ProductDetails(){
		return productService.getAllProduct();
	}
}

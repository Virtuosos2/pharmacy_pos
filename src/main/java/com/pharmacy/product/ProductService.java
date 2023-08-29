package com.pharmacy.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.order.Order;

@Service
public class ProductService {

	
    @Autowired
	private ProductRepository productRepository;
    
	public List<Product> getAllProduct(){
		List<Product> product =new ArrayList<>();
		productRepository.findAll().forEach(product::add);
		return product;
		}

}

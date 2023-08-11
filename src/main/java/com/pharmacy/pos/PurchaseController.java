package com.pharmacy.pos;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;

	@GetMapping("/purchase")
	public List<Purchase> PurchaseDetails() {
		return purchaseService.getAllPurchase();

	}

	@GetMapping("/purchase/{id}")
	public Purchase getPurchase(@PathVariable String id) {
		return purchaseService.getPurchase(id);
	}

	
	 @PostMapping("/purchase")
	 public void addProduct(@RequestBody Purchase product) { 
     purchaseService.addProduct(product);
	  
	  }
	 
	 @PostMapping("/purchase/{id}")
	 public void updateProduct(@RequestBody Purchase product, @PathVariable String id) {
		 purchaseService.updateProduct(id , product);
	 }
	 
}

package com.pharmacy.pos;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String Home() {
		return "Welcome to Nagpur Pharmacy";
	}
	
	@GetMapping("/purchase")
	public List<purchase> PurchaseDetails() {
		return Arrays.asList(
				new purchase(101 , "Paracetomol" , 10 , 4, 40),
				new purchase(102 , "Dolo 365" , 15, 2, 30),
				new purchase(103 , "Cheston cold" , 20 , 3, 60),
				new purchase(104 , "Jelosine" , 8 , 2, 16),
				new purchase(105 , "Azithromycin" , 25 , 2, 50)
				
				);
	}
	
	
	@GetMapping("/sell")
	public String Sell() {
		return "Selling department";
	}
	
	@GetMapping("/viewInventory")
	public String View() {
		return "To view Inventory";
	}
}

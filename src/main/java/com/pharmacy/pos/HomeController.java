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
	
	
	
	@GetMapping("/sell")
	public String Sell() {
		return "Selling department";
	}
	
	@GetMapping("/viewInventory")
	public String View() {
		return "To view Inventory";
	}


}

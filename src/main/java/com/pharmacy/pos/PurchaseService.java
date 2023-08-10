package com.pharmacy.pos;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

	
	private List<Purchase> purchase = Arrays.asList(
			new Purchase("101" , "Paracetomol" , 10 , 4, 40),
			new Purchase("102" , "Dolo 365" , 15, 2, 30),
			new Purchase("103" , "Cheston cold" , 20 , 3, 60),
			new Purchase("104" , "Jelosine" , 8 , 2, 16),
			new Purchase("105" , "Azithromycin" , 25 , 2, 50)
			
			);
	
	public List<Purchase> getAllPurchase(){
		return purchase;
		
	}
		
    public Purchase getPurchase(String id){
    	return purchase.stream().filter(n -> n.getPurchase_id().equals(id)).findFirst().get();
    	
    }
		
	
}

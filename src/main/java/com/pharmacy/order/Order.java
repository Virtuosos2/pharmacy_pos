package com.pharmacy.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer purchaseId;
	private String productName;
	private int price;
	private int quantity;
	private int total;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer purchaseId, String productName, int price, int quantity, int total) {
		super();
		this.purchaseId = purchaseId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}
	public Integer getPurchase_id() {
		return purchaseId;
	}
	public void setPurchase_id(Integer purchase_id) {
		this.purchaseId = purchase_id;
	}
	public String getProduct() {
		return productName;
	}
	public void setProduct(String product) {
		this.productName = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}

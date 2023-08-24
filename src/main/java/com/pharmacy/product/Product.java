package com.pharmacy.product;

public class Product {

	private Integer id;
	private String ProductName;
	private String ProductDescription;
	private int price;
	
	public Product(){
		
	}
	
	public Product(Integer id, String productName, String productDescription, int price) {
		super();
		this.id = id;
		ProductName = productName;
		ProductDescription = productDescription;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

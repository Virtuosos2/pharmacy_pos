package com.pharmacy.pos;

public class Purchase {
	private String purchase_id;
	private String product;
	private int price;
	private int quantity;
	private int total;


	public Purchase() {

	}

	public Purchase(String purchase_id, String product, int price, int quantity, int total  ) {
		super();
		this.purchase_id = purchase_id;
		this.product = product;
		this.price = price;
		this.total = total;
		this.quantity = quantity;
	}
	public String getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

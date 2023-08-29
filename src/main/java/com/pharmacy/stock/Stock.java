package com.pharmacy.stock;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	private Integer stockId;
	private Date stockEntryDate;
	private Date stockExpiryDate;
	private Integer purchasePrice;
	private Integer sellingPrice;
	private Integer quantity;
	
	public Stock() { 
	}
	public Stock(Integer stockId, Date stockEntryDate, Date stockExpiryDate, Integer purchasePrice,
			Integer sellingPrice, Integer quantity) {
		super();
		this.stockId = stockId;
		this.stockEntryDate = stockEntryDate;
		this.stockExpiryDate = stockExpiryDate;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public Date getStockEntryDate() {
		return stockEntryDate;
	}
	public void setStockEntryDate(Date stockEntryDate) {
		this.stockEntryDate = stockEntryDate;
	}
	public Date getStockExpiryDate() {
		return stockExpiryDate;
	}
	public void setStockExpiryDate(Date stockExpiryDate) {
		this.stockExpiryDate = stockExpiryDate;
	}
	public Integer getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Integer getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
}

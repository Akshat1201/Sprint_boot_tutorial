package com.example.dto;

import java.io.Serializable;

public class order implements Serializable{
	private static final long serialversionUID =
            1L;
	private String id;
	private String itemName;
	private int qty;
	private int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public order(String id, String itemName, int qty, int price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "order [id=" + id + ", itemName=" + itemName + ", qty=" + qty + ", price=" + price + "]";
	}
	public order() {
		super();
	}

	
}

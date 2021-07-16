package com.xworkz.collection.alcoholDto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable,Comparable<AlcoholDTO>{
	private String brand;
	private double price;
	private boolean scotch;
	private int quantity;
	private String type;
	
	public AlcoholDTO() {
		System.out.println("default");
	}

	public AlcoholDTO(String brand, double price, boolean scotch, int quantity, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	@Override
	public int compareTo(AlcoholDTO other) {
		return (this.getBrand().compareTo(other.getBrand()));
	}
	
	

}

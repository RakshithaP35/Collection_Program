package com.xworkz.collection.productDto;

import java.io.Serializable;

import com.xworkz.collection.tourismDto.PersonDTO;

public class ProductDTO implements Serializable, Comparable<ProductDTO>{
	private String name;
	private String brand;
	private float price;
	private int quantity;
	
	ProductDTO(){
		System.out.println("default");
	}

	public ProductDTO(String name, String brand, float price, int quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(ProductDTO other) {
		float priceOfOther = other.getPrice();
		if (this.price == priceOfOther)
			return 0;
		if (this.price > priceOfOther)
			return 1;
		if (this.price < priceOfOther)
			return -1;
		return 0;
	}
	
	
	

}

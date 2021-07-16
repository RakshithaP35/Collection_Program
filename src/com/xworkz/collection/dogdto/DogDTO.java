package com.xworkz.collection.dogdto;

public class DogDTO {
	private String name;
	private String color;
	private String breed;
	
	DogDTO(){
		System.out.println("default");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "DogDTO [name=" + name + ", color=" + color + ", breed=" + breed + "]";
	}
	
	

}

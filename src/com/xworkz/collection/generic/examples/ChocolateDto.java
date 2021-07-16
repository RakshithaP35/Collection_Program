package com.xworkz.collection.generic.examples;

import com.xworkz.collection.constants.Flavor;

public class ChocolateDto {

	private String name;
	private Flavor flavor;
	private int cost;
	private boolean isfruitANDnuts;

	public ChocolateDto() {
		System.out.println("default");
	}

	public ChocolateDto(String name, Flavor flavor, int cost, boolean isfruitANDnuts) {
		super();
		this.name = name;
		this.flavor = flavor;
		this.cost = cost;
		this.isfruitANDnuts = isfruitANDnuts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isIsfruitANDnuts() {
		return isfruitANDnuts;
	}

	public void setIsfruitANDnuts(boolean isfruitANDnuts) {
		this.isfruitANDnuts = isfruitANDnuts;
	}

	@Override
	public String toString() {
		return "ChocolateDto [name=" + name + ", flavor=" + flavor + ", cost=" + cost + ", isfruitANDnuts="
				+ isfruitANDnuts + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof ChocolateDto) {
			System.out.println("object is passed to chocolate");
			ChocolateDto chocolate = (ChocolateDto) obj;
			if (this.name.equals(chocolate.name) && this.flavor.equals(chocolate.flavor)) {
				System.out.println("both are same");
				return true;
			} else {
				System.out.println("both are diffrent");
				return false;
			}

		}

		return false;

	}

}

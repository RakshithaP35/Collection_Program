package com.xworkz.collection.streetDto;

import java.io.Serializable;

public class StreetDTO implements Serializable {
	private String name;
	private int pinCode;
	private String landmark;
	private String city;

	StreetDTO() {
		System.out.println("default");
	}
	

	public StreetDTO(String name, int pinCode, String landmark, String city) {
		super();
		this.name = name;
		this.pinCode = pinCode;
		this.landmark = landmark;
		this.city = city;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pinCode=" + pinCode + ", landmark=" + landmark + ", city=" + city + "]";
	}

	/*@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof StreetDTO) {
			System.out.println("obj is passed");
			StreetDTO street = (StreetDTO) obj;
			if (this.city.equals(((StreetDTO) obj).city) && this.landmark.equals(((StreetDTO) obj).landmark)) {
				System.out.println("matches");
				return true;
			} else {
				System.out.println("doesnot matches");
				return false;
			}
		}
		return false;*/

	}

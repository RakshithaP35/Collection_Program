package com.xworkz.collection.productDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.tourismDto.PersonDTO;

public class ProductTester {

	public static void main(String[] args) {
		ProductDTO chips1 = new ProductDTO("Cream and Onion","Lays",30.00f,2);
		ProductDTO chips2 = new ProductDTO("GreenChilli","Kurkure",20.00f,1);
		ProductDTO chips3 = new ProductDTO("ketchup Cream","Prinkles",100.00f,3);
		ProductDTO chips4 = new ProductDTO("Cream and Garlic","Pop Chips",450.00f,2);
		ProductDTO chips5 = new ProductDTO("Cream and salt","Potato Chips",30.00f,2);
		
		List<ProductDTO> list = new ArrayList<>();
		list.add(chips1);
		list.add(chips2);
		list.add(chips3);
		list.add(chips4);
		list.add(chips5);
		System.out.println(list.size());
		
		for (ProductDTO product : list) {
			System.out.println(product);
		}
		System.out.println("\n");
		Collections.sort(list);
		
		for(ProductDTO product: list) {
			System.out.println(product);
		}
	}

}

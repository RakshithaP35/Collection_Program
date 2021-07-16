package com.xworkz.collection.alcoholDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {
		AlcoholDTO alcohol1 = new AlcoholDTO("Mc Dowells", 300.00d,true,2,"Whiskey");
		AlcoholDTO alcohol2 = new AlcoholDTO("KingFisher",560.00d,false,1,"Beer");
		AlcoholDTO alcohol3 = new AlcoholDTO("Bacardi", 200.00d,false,4,"Rum");
		AlcoholDTO alcohol4 = new AlcoholDTO("Imperial Blue", 500.00d,true,5,"Whiskey");

		List<AlcoholDTO> list = new ArrayList<>();
		list.add(alcohol1);
		list.add(alcohol2);
		list.add(alcohol3);
		list.add(alcohol4);
		System.out.println("The Size of List is :" +list.size());
		
		for (AlcoholDTO alcoholDTO : list) {
			System.out.println(alcoholDTO);
		}
		
		System.out.println("\n");
		
		Collections.sort(list);
		for (AlcoholDTO alcoholDTO : list) {
		System.out.println(alcoholDTO);
		}
	}

}

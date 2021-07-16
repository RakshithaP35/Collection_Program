package com.xworkz.collection.streetDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StreetTester {

	public static void main(String[] args) {
		StreetDTO street1 = new StreetDTO("Maruthi Nagar",560060,"Kengeri","Bangalore");
		StreetDTO street2 = new StreetDTO("jp nagar",560061,"micoLayout","Bangalore");
		StreetDTO street3 = new StreetDTO("silkboard",560062,"Kengeri","Bangalore");
		
		List<StreetDTO> list = new ArrayList<>();
		list.add(street1);
		list.add(street2);
		list.add(street3);

		System.out.println("the city size: " + city.size());
		System.out.println("the name size: " + name.size());
		System.out.println("the pincode size: " + pincode.size());
		System.out.println("the landmark size: " + landmark.size());

		System.out.println("__");
		int indexof = name.indexOf("silkboard");
		System.out.println("silkboard " + indexof);
		int indexofpin = pincode.indexOf(560061);
		System.out.println("560061 " + indexofpin);
		int indexoflandmark = landmark.indexOf("btm Layout");
		System.out.println("kengeri " + indexoflandmark);
		int indexofcity = city.indexOf("bangalore");
		System.out.println("bangalore " + indexofcity);

		System.out.println("+++");
		ListIterator<String> itr = name.listIterator(2);
		System.out.println("Itr index" + itr.nextIndex());
		while (itr.hasPrevious()) {
			String string = itr.previous();
			System.out.println(string);
		}
		System.out.println("****");
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
		System.out.println(name.size());

		System.out.println("\nAdd all");
		name.addAll(landmark);
		System.out.println(name);
		System.out.println(name.size());

		System.out.println("\n Contains");
		name.containsAll(city);
		System.out.println(name);

		System.out.println("\n retains");
		name.retainAll(landmark);
		System.out.println(name);

		System.out.println("\n sort");
		Collections.sort(name);
		System.out.println(name);

		System.out.println("\nremove all");
		name.removeAll(landmark);
		System.out.println(name);
		System.out.println(name.size());

	}

}

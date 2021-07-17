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

		System.out.println(street1);
		System.out.println(street2);
		System.out.println(street3);
		
		
	}

}

package com.xworkz.collections.generic.country;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryCollection {

	public static void main(String[] args) {
		String country1 = "india";
		String country2 = "sri lanka";
		String country3 = "china";
		String country4 = "pakistan";
		String country5 = "dubai";
		String country6 = "canada";
		String country7 = "london";
		String country8 = "paris";
		String country9 = "australia";
		String country10 = "argentina";

		Collection<String> collection = new ArrayList<>();
		collection.add(country1);
		collection.add(country2);
		collection.add(country3);
		collection.add(country4);
		collection.add(country5);
		collection.add(country6);
		collection.add(country7);
		collection.add(country8);
		collection.add(country9);
		collection.add(country10);
		
		Iterator itr = collection.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
		
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str.toUpperCase());
		}
		}
		
		for(Object obj1: collection)
	   	{
			System.out.println(obj1);
	   	}

	}

}

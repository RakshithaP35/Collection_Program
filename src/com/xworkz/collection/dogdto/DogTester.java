package com.xworkz.collection.dogdto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class DogTester {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Maxie");
		name.add("Gimmy");
		name.add("ruby");
		System.out.println(name);
		
		List<String> color = new ArrayList<String>();
		color.add("black");
		color.add("white");
		color.add("brown");
		System.out.println(color);

		List<String> breed = new ArrayList<String>();
		breed.add("Husky");
		breed.add("lab");
		breed.add("golden ritriver");
		System.out.println(breed);
		
		int indexof = name.indexOf("Gimmy");
		System.out.println("\n");
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
		name.addAll(color);
		System.out.println(name);
		System.out.println(name.size());
		
		System.out.println("\n Contains");
		name.containsAll(breed);
		System.out.println(name);

		System.out.println("\n retains");
		name.retainAll(color);
		System.out.println(name);
		
		System.out.println("\n sort");
		Collections.sort(name);
		System.out.println(name);
		
		System.out.println("\nremove all");
		name.removeAll(color);
		System.out.println(name);
		System.out.println(name.size());

	}

}

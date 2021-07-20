package com.xworkz.collection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MountainTester {

	public static void main(String[] args) {
		Set<String> mountainSet = new HashSet<String>();
		Set<String> mountainSet1 = new TreeSet<String>();

		mountainSet.add("Mt.Everest");
		mountainSet.add("Mt.Abu");
		mountainSet.add("Mt.Mullatangiri");
		mountainSet.add("Mt.Madhugiri");
		mountainSet.add("Shivaganga");
		mountainSet.add("DD hills");
		mountainSet.add("Savandurga");
		mountainSet.add("DD hills");
		mountainSet.add("Savandurga");
		mountainSet.add(null);
		mountainSet.add(null);
		System.out.println(mountainSet.size());
		
		//Collection.sort(mountainSet);
		Iterator<String> itr = mountainSet.iterator();
		while (itr.hasNext()) {
		String string = (String)itr.next();
		System.out.println(string);
		}
		
		Collection<Integer>nos = new HashSet();
		int a = 45;// auto boxing
		nos.add(a);
		
		
		
		
		
	}

}

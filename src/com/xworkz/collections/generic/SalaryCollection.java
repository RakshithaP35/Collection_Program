package com.xworkz.collections.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SalaryCollection {

	public static void main(String[] args) {
		int salary1 = 900;
		int salary2 = 6000;
		int salary3 = 3000;

		Collection<Integer> collection = new ArrayList<Integer>();

		collection.add(salary1);
		collection.add(salary2);
		collection.add(salary3);

		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();

			if (obj instanceof Integer) {
				int salary = (Integer) obj;
				if (salary >= 5000) {
					System.out.println("Great Salary");
				} else if (salary >= 1000)
					System.out.println("Good Salary");
				else
					System.out.println("Not Good Salary");
			}
		}

	}

}

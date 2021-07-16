package com.xworkz.collections.generic.employeeid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmployeeIDCollection {

	public static void main(String[] args) {

		String employeeId1 = "rakshitha35";
		String employeeId2 = "ranjith45";
		String employeeId3 = "guru2";
		String employeeId4 = "durga34";
		String employeeId5 = "reshma2";
		String employeeId6 = "gagana7";
		String employeeId7 = "nihtin1";
		String employeeId8 = "harshith6";
		String employeeId9 = "vishehs44";

		Collection<String> collection = new ArrayList<>();
		collection.add(employeeId1);
		collection.add(employeeId2);
		collection.add(employeeId3);
		collection.add(employeeId4);
		collection.add(employeeId5);
		collection.add(employeeId6);
		collection.add(employeeId7);
		collection.add(employeeId8);
		collection.add(employeeId9);
		
		
		Iterator itr = collection.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();

			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}
		}

	}

}

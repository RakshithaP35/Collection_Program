package com.xworkz.collection.tourismDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO dto1 = new PersonDTO("Rakshitha", 22, "rakshitha3518@gmail.com");
		PersonDTO dto2 = new PersonDTO("Tejashvini", 23, "tejashvini@gmail.com");
		PersonDTO dto3 = new PersonDTO("Sahana", 24, "sahana@gmail.com");
		PersonDTO dto4 = new PersonDTO("Dhanya", 23, "dhanya@gmail.com");
		PersonDTO dto5 = new PersonDTO("Shantanu", 24, "shantanu@gmail.com");
		PersonDTO dto6 = new PersonDTO("Anusha", 24, "anusha@gmail.com");

		List<PersonDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);

		for (PersonDTO person : list) {
			System.out.println(person);
		}

		System.out.println("****");
		Collections.sort(list);

		for (PersonDTO person : list) {
			System.out.println(person);
		}
	}

}

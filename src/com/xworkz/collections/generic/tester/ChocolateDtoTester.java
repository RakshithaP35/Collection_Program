package com.xworkz.collections.generic.tester;

import com.xworkz.collection.constants.Flavor;
import com.xworkz.collection.generic.examples.ChocolateDto;

public class ChocolateDtoTester {

	public static void main(String[] args) {
		ChocolateDto c = new  ChocolateDto("KitKat",Flavor.Cream,250,false );
		System.out.println(c);
		ChocolateDto choco = new ChocolateDto("MilkyBar",Flavor.Cream,150,false);
		System.out.println(choco);
		System.out.println(c.equals(choco));
		

	}

}

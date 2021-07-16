package com.xworkz.collections.generic.tester;

import com.xworkz.collection.constants.Brand;
import com.xworkz.collection.generic.examples.CosmeticDto;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDto cosmetic = new CosmeticDto(Brand.Lakme,450,"LipStick",false);
		System.out.println(cosmetic);
		CosmeticDto cosmetic1 = new CosmeticDto(Brand.Lakme,450,"LipStick",false);
		System.out.println(cosmetic1);
		System.out.println(cosmetic.equals(cosmetic1));

	}

}

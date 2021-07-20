package com.xworkz.collection.set.kitchenComparator;

import java.util.Comparator;

import com.xworkz.collection.set.kitchenItemsDTO.KitchenItemsDTO;

public class KitchenItemPriceDescComparator implements Comparator<KitchenItemsDTO>{
	
	@Override
	public int compare(KitchenItemsDTO kitchen1, KitchenItemsDTO kitchen2) {
			if (kitchen1.getPrice() == kitchen2.getPrice()) {
				return 0;
			}
			if (kitchen1.getPrice() > kitchen2.getPrice()) {
				return -1;
			}
			if (kitchen1.getPrice() < kitchen2.getPrice()) {
				return 1;
			}
		return 0;
	}
	

}

package com.xworkz.collection.set.kitchenComparator;

import java.util.Comparator;

import com.xworkz.collection.set.kitchenItemsDTO.KitchenItemsDTO;

public class KitchenItemUsedForComparatorDesc implements Comparator<KitchenItemsDTO>{
	
	@Override
	public int compare(KitchenItemsDTO kitchen1, KitchenItemsDTO kitchen2) {
		
		return kitchen1.getUsedFor().compareTo(kitchen2.getUsedFor()); 
	}

}

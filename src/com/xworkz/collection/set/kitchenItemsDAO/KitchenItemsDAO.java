package com.xworkz.collection.set.kitchenItemsDAO;

import java.util.Collection;

import com.xworkz.collection.set.kitchenItemsDTO.KitchenItemsDTO;

public interface KitchenItemsDAO {
	
	boolean saveUnique(KitchenItemsDTO dto);
	
	Collection<KitchenItemsDTO> findAllSortUsedfor();
	
	Collection<KitchenItemsDTO> findAllSortUsedforDesc();
	
	Collection<KitchenItemsDTO> findAllSortByName();
	
	Collection<KitchenItemsDTO> findAllSortByPriceDesc();
	

}

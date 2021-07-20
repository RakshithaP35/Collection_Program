package com.xworkz.collection.set.kitchenItemsDTO;

import java.util.Collection;
import java.util.TreeSet;

import com.xworkz.collection.set.kitchenItemsDAO.KitchenItemsDAO;
import com.xworkz.collection.set.kitchenItemsDAO.KitchenItemsDAOimpl;

public class KitchenItemsTester {

	public static void main(String[] args) {
		KitchenItemsDTO dto1 = new KitchenItemsDTO("Plate", 200, "Eating", "Steel");
		KitchenItemsDTO dto2 = new KitchenItemsDTO("Pan", 300, "Cooking pusrpose", "metal");
		KitchenItemsDTO dto3 = new KitchenItemsDTO("Glass", 100, "Drinking purpose", "steel");

		System.out.println("\n");
		KitchenItemsDAO dao = new KitchenItemsDAOimpl();

		System.out.println("\n");
		dao.saveUnique(dto3);
		dao.saveUnique(dto2);
		dao.saveUnique(dto1);

		System.out.println("\n");
		Collection<KitchenItemsDTO> collection1 = dao.findAllSortUsedfor();
		for (KitchenItemsDTO kitchenItem : collection1) {
			System.out.println("find all sort used for : " + kitchenItem);
		}
		
		System.out.println("\n");
		Collection<KitchenItemsDTO> collection2 = dao.findAllSortUsedforDesc();
		for (KitchenItemsDTO kitchenItem : collection2) {
			System.out.println("find all sort used for desc: " + kitchenItem);
		}
		
		System.out.println("\n");
		Collection<KitchenItemsDTO> collection3 = dao.findAllSortByName();
		for (KitchenItemsDTO kitchenItem : collection3) {
			System.out.println("find all sort by name : " + kitchenItem);
		}
		
		System.out.println("\n");
		Collection<KitchenItemsDTO> collection4 = dao.findAllSortByPriceDesc();
		for (KitchenItemsDTO kitchenItem : collection4) {
			System.out.println("find all sort by price desc : " + kitchenItem);
		}

	}

}

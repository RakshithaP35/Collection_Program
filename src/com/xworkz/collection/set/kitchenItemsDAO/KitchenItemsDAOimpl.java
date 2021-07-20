package com.xworkz.collection.set.kitchenItemsDAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.set.kitchenComparator.KitchenItemNameComparator;
import com.xworkz.collection.set.kitchenComparator.KitchenItemPriceDescComparator;
import com.xworkz.collection.set.kitchenComparator.KitchenItemUsedForComparator;
import com.xworkz.collection.set.kitchenComparator.KitchenItemUsedForComparatorDesc;
import com.xworkz.collection.set.kitchenItemsDTO.KitchenItemsDTO;
public class KitchenItemsDAOimpl implements KitchenItemsDAO{
	

	private List <KitchenItemsDTO> list = new ArrayList<>();
	@Override
	public boolean saveUnique(KitchenItemsDTO dto) {
		System.out.println("saveUnique : " +dto);
		return list.add(dto);
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortUsedfor() {
		System.out.println("findAllSortByUsedFor : ");
		Collections.sort(list, new KitchenItemUsedForComparator());
		return this.list;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortUsedforDesc() {
		System.out.println("findAllSortByUsedForDesc: ");
		Collections.sort(list, new KitchenItemUsedForComparatorDesc());
		return this.list;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortByName() {
		System.out.println("findAllSortByName: ");
		Collections.sort(list, new KitchenItemNameComparator());
		return this.list;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortByPriceDesc() {
		System.out.println("findAllSortByPriceDesc");
		Collections.sort(list, new KitchenItemPriceDescComparator());
		return this.list;
	}

	
	

}

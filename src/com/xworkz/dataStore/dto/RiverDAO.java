package com.xworkz.dataStore.dto;

import com.xworkz.dataStore.dao.RiverDTO;

public interface RiverDAO {
	boolean save(RiverDTO dto);
	int totalItems();
	void update(RiverDTO dto);
	boolean delete(RiverDTO dto); 

}

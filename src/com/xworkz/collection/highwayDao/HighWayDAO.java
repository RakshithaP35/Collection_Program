package com.xworkz.collection.highwayDao;

import java.util.Collection;

import com.xworkz.collection.highwayDto.HighWayDTO;
import com.xworkz.collection.highwayType.HighWayType;

public interface HighWayDAO{
	
	boolean save (HighWayDTO dto);
	Collection<HighWayDTO> findAll();
	Collection<HighWayDTO> findAllNumber();
	int totalItems();
	Collection<HighWayDTO> findbyHighWayType(HighWayType type);
	Collection<HighWayDTO> findbyStateName(String sname);
	Collection<Integer> findNumberbyStateName(String sname);
	boolean exist(HighWayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighWayDTO findByMaxLength();
	HighWayDTO findByMinLength();

}

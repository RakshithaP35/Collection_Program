package com.xworkz.collection.highwayDto;

import com.xworkz.collection.highwayDao.HighWayDAO;
import com.xworkz.collection.highwayDao.HighWayDAOimpl;
import com.xworkz.collection.highwayType.HighWayType;

public class HighTester {

	public static void main(String[] args) {
		HighWayDTO dto = new HighWayDTO(1,45,HighWayType.nh,"Karnataka",800,true,"EPC");
		HighWayDTO dto1 = new HighWayDTO(2,25,HighWayType.sh,"maharastra",700,true,"NCR");
		HighWayDTO dto2 = new HighWayDTO(3,15,HighWayType.nh,"TamilNadu",600,true,"IRB");
		
		HighWayDAO dao = new HighWayDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		
		System.out.println("findAll " + dao.findAll());
		System.out.println("exist " + dao.exist(dto2));
		System.out.println("find by number :" + dao.findAllNumber());
		System.out.println("find by length :" + dao.findLengthByNumber(800));
		System.out.println("find by sate name: " + dao.findbyStateName("Karnataka"));
		System.out.println("find by type :" + dao.findbyHighWayType(HighWayType.nh));
		System.out.println("find  number by state name :" + dao.findNumberbyStateName("TamilNadu"));
		System.out.println("find is condition :" + dao.isCondition(25));
		System.out.println("max : " + dao.findByMaxLength());
		System.out.println("min : " + dao.findByMinLength());
	}

}

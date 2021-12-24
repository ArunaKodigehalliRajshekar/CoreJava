package com.xworkz.encapsulation.Testencapsulation;

import com.xworkz.encapsulation.OneplusearphoneDTO;
import com.xworkz.encapsulation.Oneplusoperationdetails;

public class TestOneplusearphone {
	public static void main(String []args) {
		
		Oneplusoperationdetails  operation = new Oneplusoperationdetails();
		OneplusearphoneDTO dto = new OneplusearphoneDTO();
		OneplusearphoneDTO dto1 = new OneplusearphoneDTO();
		OneplusearphoneDTO dto2 = new OneplusearphoneDTO();
		
		
		dto.setModel("HD911");
		dto.setProcessor("mq3s");
		dto.setColor("black");
		dto.setPrice(3000);
		dto.setBattery((short)38);
		dto.setNoofconnectios((byte)2);
		dto.setNoisecollection("40db");
		dto.setWaterresistance("IP55");
		
		operation.collect(dto);
		operation.getAll();
		
		dto1.setModel("SL91");
		dto1.setProcessor("mq2t");
		dto1.setColor("white");
		dto1.setPrice(2800);
		dto1.setBattery((short)13);
		dto1.setNoofconnectios((byte)2);
		dto1.setNoisecollection("35db");
		dto1.setWaterresistance("IP35");
		
		operation.collect(dto1);
		//operation.getAll();
		
		dto2.setModel("sql92");
		dto2.setProcessor("ds3t");
		dto2.setColor("grey");
		dto2.setPrice(3500);
		dto2.setBattery((short)28);
		dto2.setNoofconnectios((byte)2);
		dto2.setNoisecollection("50db");
		dto2.setWaterresistance("IP65");
		
		operation.collect(dto2);
		operation.getAll();
		System.out.println();
		OneplusearphoneDTO res = operation.updateProcessorByModel("SL91","msl90");
		System.out.println(res.printAll());
		System.out.println();
		operation.getAll();
		System.out.println();
		System.out.println(operation.deleteByModel("sql92"));
		operation.getAll();
	}

}

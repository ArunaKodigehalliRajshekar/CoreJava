package com.xworkz.encapsulation.Testencapsulation;

import com.xworkz.encapsulation.OneplusmobileDTO;
import com.xworkz.encapsulation.Operatoroneplusmobie;

public class TestOneplusmobile {
	public static void main(String []args) {
		
		Operatoroneplusmobie  operator = new Operatoroneplusmobie();
		//Operatoroneplusmobie  operator1 = new Operatoroneplusmobie();
		//Operatoroneplusmobie  operator2 = new Operatoroneplusmobie();
		
		OneplusmobileDTO  dto = new OneplusmobileDTO();
		OneplusmobileDTO  dto1 = new OneplusmobileDTO();
		OneplusmobileDTO  dto2 = new OneplusmobileDTO();

		
		dto.setModel("HD911");
		dto.setPrice(52000);
		dto.setColor("bluehale");
		dto.setProcessor("750SD");
		dto.setRam((byte)12);
		dto.setNoofcamera((byte)4);
		dto.setLength(6.1f);
		dto.setStorage((short)256);
		dto.setBatterycapacity((short)4500);
		dto.setCameradetails("40mp");
		operator.add(dto);
		operator.printAll();
		
		dto1.setModel("7t");
		dto1.setPrice(52000);
		dto1.setColor("matblack");
		dto1.setRam((byte)12);
		dto1.setNoofcamera((byte)5);
		dto1.setLength(6.25f);
		dto1.setStorage((short)256);
		dto.setBatterycapacity((short)4500);
		dto.setCameradetails("40mp");
		operator.add(dto1);
		
		
		
		dto2.setModel("6t");
		dto2.setPrice(42000);
		dto2.setColor("blue");
		dto2.setRam((byte)8);
		dto2.setNoofcamera((byte)3);
		dto2.setLength(6.25f);
		dto2.setStorage((short)126);
		dto.setBatterycapacity((short)4500);
		dto.setCameradetails("40mp");
		operator.add(dto2);
		operator.printAll();
		System.out.println();
		
		OneplusmobileDTO oneplus =operator.updateRamUsingModel("HD911",(byte)16);
		 System.out.println(oneplus.toString());
		 System.out.println();
		
		operator.printAll();
		
		System.out.println();
		
		OneplusmobileDTO mobile = operator.deleteByModel("6t");
		System.out.println(mobile);
		operator.printAll();
		
		
	}

}

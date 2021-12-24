package com.xworkz.encapsulation.Testencapsulation;

import com.xworkz.encapsulation.OneplusWatchdetailsDTO;
import com.xworkz.encapsulation.operators.WatchOperatordetails;

public class TestWatchdetails {
  public static void main(String[] args) {
	
	  WatchOperatordetails operator = new WatchOperatordetails();
	  OneplusWatchdetailsDTO  dto = new OneplusWatchdetailsDTO();
	  OneplusWatchdetailsDTO  dto1 = new OneplusWatchdetailsDTO();
	  OneplusWatchdetailsDTO  dto2 = new OneplusWatchdetailsDTO();
	  
	  dto.setPrice(3300);
	  dto.setModel("HD911");
	  dto.setColor("dark-black");
	  dto.setProcessor("700SD");
	  dto.setRam((byte)3);
	  dto.setSteps(true);
	  dto.setHeartbeat(true);
	  dto.setStorage(false);
	  dto.setWaterresistance("IP8");
	  	  
	  dto.setPrice(3000);
	  dto1.setModel("MC90");
	  dto1.setColor("dark-blue");
	  dto1.setProcessor("600SD");
	  dto1.setRam((byte)3);
	  dto1.setSteps(true);
	  dto1.setHeartbeat(true);
	  dto1.setStorage(false);
	  dto1.setWaterresistance("IP68");
	  
	  dto2.setPrice(2800);
	  dto2.setModel("Ammu1");
	  dto2.setColor("imperial-blue");
	  dto2.setProcessor("MH90");
	  dto2.setRam((byte)3);
	  dto2.setSteps(true);
	  dto2.setHeartbeat(true);
	  dto2.setStorage(false);
	  dto2.setWaterresistance("IP4");
	  
	  operator.add(dto);
	  operator.add(dto1);
	  operator.add(dto2);
	  operator.printAll();
	  System.out.println();
	  OneplusWatchdetailsDTO res=  operator.updateRamByModel("MC90",(short)512);
	  System.out.println(res.toString());
	  System.out.println();
         operator.printAll();
         System.out.println();
         System.out.println(operator.deleteByModel("Ammu1"));
         operator.printAll();
  }
}

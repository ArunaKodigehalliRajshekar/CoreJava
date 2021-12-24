package com.xworkz.operations.testoperations;

import com.xworkz.operations.dtoDetails.ButterflydetailsDTO;
import com.xworkz.operations.dtoDetails.Butterflyoperatordetails;

public class TestButterflyoperator {
	public static void main(String []args) {
		
		Butterflyoperatordetails operator =new Butterflyoperatordetails();
		ButterflydetailsDTO dto = new ButterflydetailsDTO("king","black-red",2.5f,5.6f);
		ButterflydetailsDTO dto1 = new ButterflydetailsDTO("queen","cofee",2.15f,5.6f);
		ButterflydetailsDTO dto2 = new ButterflydetailsDTO("helicofter","maroon-red",1.5f,8.6f);
		ButterflydetailsDTO dto3 = new ButterflydetailsDTO("caterpiller","yellow",0.5f,2.6f);
		
		operator.flying(dto);
		operator.flying(dto1);
		operator.flying(dto2);
		operator.flying(dto3);
		operator.getAll();
		System.out.println();
		
		System.out.println(operator.updateheightusingname("king",6.86f).printAll());
		System.out.println();
		operator.getAll();
		System.out.println();
		System.out.println(operator.delete("caterpiller"));
		operator.getAll();
	}
}

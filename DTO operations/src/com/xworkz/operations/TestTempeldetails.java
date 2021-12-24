package com.xworkz.operations;

import com.xworkz.operations.dtoDetails.TempeldetailsDTO;
import com.xworkz.operations.dtoDetails.TempeloperatorDTO;

public class TestTempeldetails {
	public static void main(String []args) {
	TempeloperatorDTO operator = new TempeloperatorDTO();
	TempeldetailsDTO dto = new TempeldetailsDTO("manjunatha_tempel","shiva","dharmasthala",16,"Dharmastala_trust");
	TempeldetailsDTO dto1 = new TempeldetailsDTO("venkateshwara_tempel","vishnu","tirupathi",24,"Government");
	TempeldetailsDTO dto2 = new TempeldetailsDTO("mukambika_tempel","mookambike","kollur",14,"muzurai");
	TempeldetailsDTO dto3 = new TempeldetailsDTO("subramanya_tempel","subramanya","kukke",12,"subramanya trust");
	TempeldetailsDTO dto4 = new TempeldetailsDTO("chamundeswari_tempel","chamundeswari","mysore",10,"karnata govt");
	
	operator.pray(dto);
	operator.pray(dto1);
	operator.pray(dto2);
	operator.pray(dto3);
	operator.pray(dto4);
	operator.getAll();
	System.out.println();
	
	System.out.println(operator.updatemaintainancebyname("subramanya_tempel","muzurai"));
	operator.getAll();
	System.out.println();
	System.out.println(operator.delete("venkateshwara_tempel"));
	operator.getAll();
	
	}

}

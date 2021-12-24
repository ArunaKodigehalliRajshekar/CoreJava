package com.xworkz.postoffice;

import com.xworkz.postoffice.dao.PostofficeDAO;
import com.xworkz.postoffice.dto.AdressDTO;
import com.xworkz.postoffice.dto.PostofficeDTO;

public class TestPostoffice {
	public static void main(String []args) {
		
		PostofficeDTO details = new PostofficeDTO();
		PostofficeDTO details1 = new PostofficeDTO();
		PostofficeDTO details2 = new PostofficeDTO();
		PostofficeDTO details3 = new PostofficeDTO(); 
		AdressDTO dto = new AdressDTO();
		AdressDTO dto1 = new AdressDTO();
		AdressDTO dto2 = new AdressDTO();
		AdressDTO dto3 = new AdressDTO();
		
		details.setPostMater("Rangappa");
		details.setPincode(572140);
		details.setNoofworkers((byte)6);
		details.setTypist("lakshmamma");
		
		details1.setPostMater("Sharanappa");
		details1.setPincode(572142);
		details1.setNoofworkers((byte)6);
		details1.setTypist("Thayamma");
		
		details2.setPostMater("Santhosh");
		details2.setPincode(572143);
		details2.setNoofworkers((byte)6);
		details2.setTypist("honamma");
		
		details3.setPostMater("krishnappa");
		details3.setPincode(572144);
		details3.setNoofworkers((byte)6);
		details3.setTypist("madana");
		
		dto.setOfficearea("Byatha");
		dto.setHobli("urudigere");
		dto.setTaluk("Tumkur");
		dto.setPincode(572140);
		
		dto1.setOfficearea("aregujnahalli");
		dto1.setHobli("urudigere");
		dto1.setTaluk("Tumkur");
		dto1.setPincode(572142);
		
		dto2.setOfficearea("arasikere");
		dto2.setHobli("kasaba");
		dto2.setTaluk("arasikere");
		dto2.setPincode(572143);
		
		dto3.setOfficearea("leggere");
		dto3.setHobli("bang");
		dto3.setTaluk("banglore");
		dto3.setPincode(572144);
		
		details.setAdress(dto);
		details1.setAdress(dto1);
		details2.setAdress(dto2);
		details3.setAdress(dto3);
		System.out.println(details.getPostMater());
		System.out.println(dto.getOfficearea());
		System.out.println(dto1.getTaluk());
		System.out.println();
		PostofficeDAO dao = new PostofficeDAO();
		dao.add(details);
		dao.add(details1);
		dao.add(details2);
		dao.add(details3);
		dao.printAll();
		System.out.println();
		System.out.println();
		PostofficeDTO result= dao.updatepostMasterBypincode("seenaiaha",572142);
		System.out.println(result.toString());
		System.out.println();
		dao.printAll();
		
		System.out.println();
		PostofficeDTO result1=dao.updatenoofworkersBypincode((byte)4,572140);
		System.out.println(result1.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		PostofficeDTO result2=dao.updatetypistBypincode("neelamma",572144);
		System.out.println(result2.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		PostofficeDTO rst= dao.getByTypist("lakshmamma");
		System.out.println(rst);
		System.out.println();
		PostofficeDTO rst1 = dao.getByPincode(572143);
		System.out.println(rst1);
		System.out.println();
		PostofficeDTO rst2=dao.getByHobli("urudigere");
		System.out.println(rst2);
		System.out.println();
		PostofficeDTO res=dao.deleteByTypist("Thayamma");
		System.out.println(res);
		dao.printAll();
		System.out.println();
		PostofficeDTO res1 = dao.deleteByPincode(572143);
		System.out.println(res1);
		dao.printAll();
		System.out.println();
		PostofficeDTO res2=dao.deleteByOfficearea("leggere");
		System.out.println(res2);
		dao.printAll();
	}

}

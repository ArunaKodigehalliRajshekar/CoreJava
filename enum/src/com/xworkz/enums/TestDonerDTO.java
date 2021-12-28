package com.xworkz.enums;

import com.xworkz.enums.dao.DonarOperation;
import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.ContactDetailsDTO;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class TestDonerDTO {
	public static void main(String[] args) {
		
		
		DonerDTO dto = new DonerDTO();
		dto.setName("Aruna KR");
		dto.setAge((byte)23);
		dto.setWeight(80.5f);
		dto.setBloodGroup(BloodGroup.O_POSITIVE);
		dto.setGender(Gender.MALE);
		
		DonerDTO dto1 = new DonerDTO();
		dto1.setName("GAVI");
		dto1.setAge((byte)25);
		dto1.setWeight(78.5f);
		dto1.setBloodGroup(BloodGroup.A_POSITIVE);
		dto1.setGender(Gender.MALE);
		
		DonerDTO dto2 = new DonerDTO();
		dto2.setName("AMMU");
		dto2.setAge((byte)21);
		dto2.setWeight(58.5f);
		dto2.setBloodGroup(BloodGroup.AB_POSITIVE);
		dto2.setGender(Gender.FEMALE);
		
		DonerDTO dto3 = new DonerDTO();
		dto3.setName("ANUSHA");
		dto3.setAge((byte)21);
		dto3.setWeight(53.5f);
		dto3.setBloodGroup(BloodGroup.A_POSITIVE);
		dto3.setGender(Gender.FEMALE);
		
		
		ContactDetailsDTO details = new ContactDetailsDTO();
		details.setContactNumber(8550071423l);
		details.setEmail("arunakr.xworkz@gmail.com");
		details.setAdress("kodigehalli");
		
		ContactDetailsDTO details1 = new ContactDetailsDTO();
		details1.setContactNumber(9845632140l);
		details1.setEmail("gaviranga.xworkz@gmail.com");
		details1.setAdress("turvekere");
		
		ContactDetailsDTO details2 = new ContactDetailsDTO();
		details2.setContactNumber(9148407768l);
		details2.setEmail("amrutha.xworkz@gmail.com");
		details2.setAdress("banglore");
		
		ContactDetailsDTO details3 = new ContactDetailsDTO();
		details2.setContactNumber(9148407768l);
		details2.setEmail("anusha.xworkz@gmail.com");
		details2.setAdress("ballaray");
		
		
		dto.setDetails(details);
		dto1.setDetails(details1);
		dto2.setDetails(details2);
		dto3.setDetails(details3);
		
		
		DonarOperation operation = new DonarOperation();
		operation.save(dto);
		operation.save(dto1);
		operation.save(dto2);
		operation.save(dto3);
		operation.printAll();
		System.out.println();
		System.out.println("get by bloodgroup");
		DonerDTO res=operation.getByBloodGroup(BloodGroup.A_POSITIVE);
		System.out.println(res.toString());
		System.out.println();
		System.out.println("get by gender");
		DonerDTO get = operation.getByGender(Gender.MALE);
		System.out.println(get.toString());
		System.out.println();
		System.out.println("updated contact number by name");
		DonerDTO update = operation.updateContactByName("AMMU",962362282676l);
		System.out.println(update.toString());
		System.out.println();
		operation.printAll();
		System.out.println();
		System.out.println("get all male array");
		DonerDTO[] all = operation.getByAllGender(Gender.MALE);
		for(int index=0;index<all.length;index++) {
			System.out.println(all[index]);
			System.out.println();
			System.out.println("get similar bloodgroup by array");
			DonerDTO[] response =operation.getByAllBloodGroup(BloodGroup.A_POSITIVE);
			for (int i = 0; i < response.length; i++) {
				System.out.println(response[i]);
				System.out.println();
				
			}
			
		}
		
	}

}

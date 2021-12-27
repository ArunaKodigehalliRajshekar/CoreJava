package com.xworkz.hasA;

import com.xworkz.hasA.dao.TraineeOperation;
import com.xworkz.hasA.dtos.AdressDTO;
import com.xworkz.hasA.dtos.AreaDTO;
import com.xworkz.hasA.dtos.DistrictDTO;
import com.xworkz.hasA.dtos.StateDTO;
import com.xworkz.hasA.dtos.TalukDTO;
import com.xworkz.hasA.dtos.TraineeDetails;

public class TestTraineeDetails {
	public static void main(String[] args) {
		
		TraineeDetails traineedetail = new TraineeDetails();
		TraineeDetails traineedetail1 = new TraineeDetails();
		TraineeDetails traineedetail2 = new TraineeDetails();
		traineedetail.setName("Aruna KR");
		traineedetail.setContactno(8550071423l);
		traineedetail.setEmail("arunakr.xworkz@gmail.com");
		
		traineedetail1.setName("Nagesh");
		traineedetail1.setContactno(9739538340l);
		traineedetail1.setEmail("nagesh.xworkz@gmail.com");
		
		traineedetail2.setName("Soma");
		traineedetail2.setContactno(9743065930l);
		traineedetail2.setEmail("somashekar.xworkz@gmail.com");
		
		AdressDTO adress = new AdressDTO();
		AdressDTO adress1 = new AdressDTO();
		AdressDTO adress2 = new AdressDTO();
		adress.setBuildingName("Rajindappa nilaya");
		adress1.setBuildingName("janani nilaya");
		adress2.setBuildingName("basava nilaya");
		
		traineedetail.setAdress(adress);
		traineedetail1.setAdress(adress1);
		traineedetail2.setAdress(adress2);
		
		AreaDTO area = new AreaDTO();
		AreaDTO area1 = new AreaDTO();
		AreaDTO area2 = new AreaDTO();
		area.setAreaName("Kodigehalli");
		area1.setAreaName("Anekere");
		area2.setAreaName("Praja nagar");
		
		adress.setArea(area);
		adress1.setArea(area1);
		adress2.setArea(area2);
		
		DistrictDTO district = new DistrictDTO();
		DistrictDTO district1 = new DistrictDTO();
		DistrictDTO district2 = new DistrictDTO();
		district.setName("Tumkur Gramantara");
		district1.setName("Tumkur");
		district2.setName("Dharwad");
		
		area.setDistrict(district);
		area1.setDistrict(district1);
		area2.setDistrict(district2);

		
		TalukDTO taluk =new TalukDTO();
		TalukDTO taluk1 =new TalukDTO();
		TalukDTO taluk2 =new TalukDTO();
		taluk.setName("Tumkur");
		taluk1.setName("Turuvekere");
		taluk2.setName("Dharwad");

		
		district.setTaluk(taluk);
		district1.setTaluk(taluk1);
		district2.setTaluk(taluk2);

		
		StateDTO state =new StateDTO();
		StateDTO state1 =new StateDTO();
		StateDTO state2 =new StateDTO();
		state.setName("Karnataka");
		state.setCountry("INDIA");
		
		state1.setName("Karnataka");
		state1.setCountry("INDIA");
		
		state2.setName("Karnataka");
		state2.setCountry("Australia");
		
		taluk.setState(state);
		taluk1.setState(state1);
		taluk2.setState(state2);


		TraineeOperation operation = new TraineeOperation();
		operation.save(traineedetail);
		operation.save(traineedetail1);
		operation.save(traineedetail2);
		operation.printAll();
		System.out.println();
		TraineeDetails res=operation.updateCountryByName("Nagesh","Ukraine");
		System.out.println(res.toString());
		System.out.println();
		operation.printAll();
	   System.out.println();
	   TraineeDetails response =operation.getByCountry("Australia");
	   System.out.println(response.toString());
	   System.out.println();
	   TraineeDetails response1 =operation.getByDistrict("Tumkur Gramantara");
	   System.out.println(response1.toString());
	   System.out.println();
	  
	}

}

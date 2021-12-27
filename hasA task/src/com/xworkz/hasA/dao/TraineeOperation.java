package com.xworkz.hasA.dao;

import com.xworkz.hasA.dtos.TraineeDetails;

public class TraineeOperation {
	
	TraineeDetails[] details = new TraineeDetails[4];
	int index=0;
	
	public void save(TraineeDetails names) {
		 if(index<details.length) {
			 details[index]=names;
			 index++;
		 }
	}
	
	public void printAll() {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			System.out.println(details[index].toString());
			}
		}
	}
	
	public TraineeDetails updateCountryByName(String name ,String country) {
		
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(name.equals(details[index].getName())) {
		details[index].getAdress().getArea().getDistrict().getTaluk().getState().setCountry(country);
		return details[index];
			}
		}
	}
		return details[index];
	}
	
	public TraineeDetails getByCountry(String country) {
		for(int index=0;index<details.length;index++) {
			if(country.equals(details[index].getAdress().getArea().getDistrict().getTaluk().getState().getCountry())) {
				return details[index];
			}
			
		}
		
		return null;
	}
	  
	public TraineeDetails getByDistrict(String name) {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(name.equals(details[index].getAdress().getArea().getDistrict().getName())) {
				return details[index];
			}
			}
			
		}
		  
		  return details[index];
	  }

}

package com.xworkz.motor.dao;

import com.xworkz.motor.dto.MotordetailsDTO;


public class MotordetailsDAO {
	
	MotordetailsDTO[] details = new MotordetailsDTO[4];
	int index=0;
	
	public void add(MotordetailsDTO name) {
		if(index<details.length) {
			details[index]=name;
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
	
	public MotordetailsDTO updateWarrentyByCompany(String company,byte warrenty) {
		MotordetailsDTO detail = null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(company.equals(details[index].getCompany())) {
				details[index].setWarrenty(warrenty);
				detail=details[index];
			}
			}
		}
		  return detail;
	}
	
	public MotordetailsDTO updateNoofphaseByCompany(String company,byte noofphase) {
		MotordetailsDTO detail1 = null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(company.equals(details[index].getCompany())) {
				details[index].setNoofphase(noofphase);
				detail1=details[index];
			}
			}
		}
		  return detail1;
	}
	
	public MotordetailsDTO getByCompany(String company) {
		for(int index=0;index<details.length;index++) {
			if(company.equals(details[index].getCompany())) {
				return details[index];
			}
		}
		return null;
	}
	
	public MotordetailsDTO getBySpecifictype(String specifictype) {
		for(int index=0;index<details.length;index++) {
			if(specifictype.equals(details[index].getSpecification().getSpecifictype())) {
				return details[index];
			}
		}
			return null;
	}
	
	public MotordetailsDTO deleteByColor(String color) {
		MotordetailsDTO post =null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(color.equals(details[index].getColor())) {
			details[index]=null;
			post=details[index];
			}
			}
		}
		return post;
	}
	public MotordetailsDTO deleteByHorsepower(byte horsepower) {
		MotordetailsDTO post1 =null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(horsepower==(details[index].getSpecification(). getHorsepower())) {
			details[index]=null;
			post1=details[index];
			}
			}
		}
		return post1;
	}
}

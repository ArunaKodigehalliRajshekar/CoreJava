package com.xworkz.radio.dao;

import com.xworkz.radio.dto.RadiodetailsDTO;

public class RadiodetailsDAO {
	RadiodetailsDTO[] details = new RadiodetailsDTO[4];
	int index=0;
	
	public void add(RadiodetailsDTO name) {
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
	
	public RadiodetailsDTO updateNoofStationByCompany(String company,byte noOfStation) {
		RadiodetailsDTO update =null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(company.equals(details[index].getCompany())) {
				details[index].setNoOfStation(noOfStation);
				update=details[index];
			}
			}
		}
		return update;
	}
	
	public RadiodetailsDTO updateFrequencyByColor(String color,float frequency) {
		RadiodetailsDTO update1 =null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(color.equals(details[index].getColor())) {
				details[index].setFrequency(frequency);
				update1=details[index];
			}
			}
		}
		return update1;
	}
	
	public RadiodetailsDTO getByColor(String color) {
		for(int index=0;index<details.length;index++) {
			if(color.equals(details[index].getColor())) {
				return details[index];
			}
		}
		return null;
	}
	public RadiodetailsDTO getByLength(double length) {
		for(int index=0;index<details.length;index++) {
			if(length==(details[index].getSize().getLength())) {
				return details[index];
			}
		}
		return null;
	}
	
	
	
	public RadiodetailsDTO deleteByCompany(String company) {
		RadiodetailsDTO detail =null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(company.equals(details[index].getCompany())) {
				details[index]=null;
				detail=details[index];
			}
			}
		}
	      return detail;
	}
	public RadiodetailsDTO deleteByWeight(byte weight) {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(weight==(details[index].getSize().getWeight())) {
				details[index]=null;
			}
			}
		}
		return details[index];
	}

}

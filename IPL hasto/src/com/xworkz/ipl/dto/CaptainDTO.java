package com.xworkz.ipl.dto;

public class CaptainDTO {
	String name;
	byte yearOfExperience;
	long  acPrice;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(byte yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public long getAcPrice() {
		return acPrice;
	}
	public void setAcPrice(long acPrice) {
		this.acPrice = acPrice;
	}

	public String toString() {
		return "CaptainDTO [name=" + name + ", yearOfExperience=" + yearOfExperience + ", acPrice=" + acPrice + "]";
	}
	
	

}

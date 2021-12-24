package com.xworkz.operations.dtoDetails;

public class ButterflydetailsDTO {
	String name;
	String color;
	float length;
	float height;
	
	public ButterflydetailsDTO(String name,String color,float length,float height) {
		this.name=name;
		this.color=color;
		this.length=length;
		this.height=height;
	}

	public String printAll() {
		
		return "name="+name +"\t"+"color="+color +"\t"+"length="+length +"\t"+"height="+height;
	}
}

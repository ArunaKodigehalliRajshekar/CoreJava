package com.xworkz.inheritance.airlines;

public class Indigo extends AirlinesDTO{
	public int founded =2005;
	public short fleetSize=275;
	public byte destinations=95;
	public String founder="Rahul Bhatia";
	public String revenue="15677.60crore";
	
	public Indigo() {
		super();
		System.out.println("invoking indigo class()");
	}
	
	public Indigo(long income) {
		this();
		System.out.println("income of indigo" +income);
	}
	
	public int noofemployees(int employees) {
		return employees;
	}
	
	public byte noofdestinations(byte destinies) {
		return destinies;
	}
	
	public String airbusname(String name) {
		return name;
	}
	
	public String newDomesticRule(String hyderabad) {
		return hyderabad;
	}
	
	public String tiesForEntertainment(String sony) {
		return sony;
	}
	

}

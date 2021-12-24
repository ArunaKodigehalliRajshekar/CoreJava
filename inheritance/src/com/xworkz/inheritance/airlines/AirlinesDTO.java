package com.xworkz.inheritance.airlines;

public class AirlinesDTO {
	
	public String purpose="transporting";
	public String firstCompany="DELAG";
	public int yearoffoundation =1909;
	public float globalGDP = 3.6f;
	public long price =189526217896520l;
	
	public AirlinesDTO() {
		System.out.println("airlines are fastest mode of transportation");
	}
	
	public String emphasis(String widebuisness) {
		return widebuisness;
	}
	
	public String types(String national) {
		return national;
	}
	
	public String biggestAirline(String biggestairline) {
		return biggestairline;
	}
	
	public String buisnessModel(String fullserviceCarriers) {
		return fullserviceCarriers;
	}
	
	public String website(String bookingticket) {
		return bookingticket;
	}

}

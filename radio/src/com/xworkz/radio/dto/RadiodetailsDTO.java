package com.xworkz.radio.dto;

public class RadiodetailsDTO {
	private String company;
	private String color;
	private int price;
	private byte noOfStation;
	private float frequency;
	private SizeDTO size;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public byte getNoOfStation() {
		return noOfStation;
	}
	public void setNoOfStation(byte noOfStation) {
		this.noOfStation = noOfStation;
	}
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public SizeDTO getSize() {
		return size;
	}
	public void setSize(SizeDTO size) {
		this.size = size;
	}
	
	public RadiodetailsDTO() {
		
	}
	
	public String toString() {
		return "RadiodetailsDTO [company=" + company + ", color=" + color + ", price=" + price + ", noOfStation="
				+ noOfStation + ", frequency=" + frequency + ", size=" + size + "]";
	}
	
	

}

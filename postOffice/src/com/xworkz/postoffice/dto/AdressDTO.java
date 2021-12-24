package com.xworkz.postoffice.dto;

public class AdressDTO {
	private String officearea;
	private String hobli;
	private String taluk;
	private int pincode;
	
	public String getOfficearea() {
		return officearea;
	}
	public void setOfficearea(String officearea) {
		this.officearea = officearea;
	}
	public String getHobli() {
		return hobli;
	}
	public void setHobli(String hobli) {
		this.hobli = hobli;
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public String toString() {
		return "AdressDTO [officearea=" + officearea + ", hobli=" + hobli + ", taluk=" + taluk + ", pincode=" + pincode
				+ "]";
	}
	
	
	

}

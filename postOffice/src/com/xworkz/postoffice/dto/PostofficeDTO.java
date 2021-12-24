package com.xworkz.postoffice.dto;

public class PostofficeDTO {
	private String postMater;
	private int pincode;
	private byte noofworkers;
	private String typist;
	private AdressDTO adress;
	
	public PostofficeDTO() {
		
	}
	public String getPostMater() {
		return postMater;
	}
	public void setPostMater(String postMater) {
		this.postMater = postMater;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public byte getNoofworkers() {
		return noofworkers;
	}
	public void setNoofworkers(byte noofworkers) {
		this.noofworkers = noofworkers;
	}
	public String getTypist() {
		return typist;
	}
	public void setTypist(String typist) {
		this.typist = typist;
	}
	public AdressDTO getAdress() {
		return adress;
	}
	public void setAdress(AdressDTO adress) {
		this.adress = adress;
	}
	
	public String toString() {
		return "PostofficeDTO [postMater=" + postMater + ", pincode=" + pincode + ", noofworkers=" + noofworkers
				+ ", typist=" + typist + ", adress=" + adress + "]";
	}
	
     
	

}

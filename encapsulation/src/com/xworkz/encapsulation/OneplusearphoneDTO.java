package com.xworkz.encapsulation;

public class OneplusearphoneDTO {
	private String model;
	private String processor;
	private String color;
	private int price;
	private short battery;
	private byte noofconnectios;
	private String noisecollection;
	private String waterresistance;
	private String tws;
	private String neckband;
	
	public OneplusearphoneDTO() {
		
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getProcessor() {
		return processor;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setBattery(short battery) {
		this.battery = battery;
	}
	
	public short getBattery() {
		return battery;
	}
	public void setNoofconnectios(byte noofconnectios) {
		this.noofconnectios = noofconnectios;
	}
	
	public byte getNoofconnectios() {
		return noofconnectios;
	}
	public void setNoisecollection(String noisecollection) {
		this.noisecollection = noisecollection;
	}
	
	public String getNoisecollection() {
		return noisecollection;
	}
	public void setWaterresistance(String waterresistance) {
		this.waterresistance = waterresistance;
	}
	
	public String getWaterresistance() {
		return waterresistance;
	}
	
	public String getTws() {
		return tws;
	}
	public void setTws(String tws) {
		this.tws = tws;
	}
	public String getNeckband() {
		return neckband;
	}
	public void setNeckband(String neckband) {
		this.neckband = neckband;
	}
	public String printAll() {
		
		return "model="+model +"\t"+ "processor="+processor +"\t"+"color="+color +"\t"+"price="+price +"\t"+
		   "battery="+battery+"\t"+"noofconnectios="+noofconnectios+"\t"+"noisecollection="+noisecollection+
		  "\t"+ "waterresistance="+waterresistance +"tws="+tws +"\t"+"neckband="+neckband;
		
	}
	
	
	

	
	 
	 

}

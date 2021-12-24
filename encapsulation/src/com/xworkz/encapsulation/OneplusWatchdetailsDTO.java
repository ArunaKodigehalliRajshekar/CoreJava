package com.xworkz.encapsulation;

public class OneplusWatchdetailsDTO {
	private String model;
	
	private int price;
	private String color;
	private String processor;
	private short ram;
	private boolean steps;
	private boolean heartbeat;
	private boolean storage;
	private String waterresistance;
	private String dialtype;
	private String display;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public short getRam() {
		return ram;
	}
	public void setRam(short ram) {
		this.ram = ram;
	}
	public boolean isSteps() {
		return steps;
	}
	public void setSteps(boolean steps) {
		this.steps = steps;
	}
	public boolean isHeartbeat() {
		return heartbeat;
	}
	public void setHeartbeat(boolean heartbeat) {
		this.heartbeat = heartbeat;
	}
	public boolean isStorage() {
		return storage;
	}
	public void setStorage(boolean storage) {
		this.storage = storage;
	}
	public String getWaterresistance() {
		return waterresistance;
	}
	public void setWaterresistance(String waterresistance) {
		this.waterresistance = waterresistance;
	}
	public String getDialtype() {
		return dialtype;
	}
	public void setDialtype(String dialtype) {
		this.dialtype = dialtype;
	}
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String toString() {
		return "OneplusWatchdetailsDTO [model=" + model + ", price=" + price + ", color=" + color + ", processor="
				+ processor + ", ram=" + ram + ", steps=" + steps + ", heartbeat=" + heartbeat + ", storage=" + storage
				+ ", waterresistance=" + waterresistance + ", dialtype=" + dialtype + ",display="+display+"]";
	}
	
	
	

}

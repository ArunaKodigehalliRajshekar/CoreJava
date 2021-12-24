package com.xworkz.encapsulation;

public class OneplusmobileDTO {
	private String model;
	private int price;
	private String color;
	private String processor;
	private byte ram;
	private byte noofcamera;
	private float length;
	private int storage;
	private short batterycapacity;
	private String cameradetails;
	
	public OneplusmobileDTO() {
		
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getProcessor() {
		return processor;
	}
	public void setRam(byte ram) {
		this.ram = ram;
	}

	public byte getRam() {
		return ram;
	}
	public void setNoofcamera(byte noofcamera) {
		this.noofcamera = noofcamera;
	}

	public byte getNoofcamera() {
		return noofcamera;
	}
	public void setLength(float length) {
		this.length = length;
	}

	public float getLength() {
		return length;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}


	public int getStorage() {
		return storage;
	}


	public short getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(short batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public String getCameradetails() {
		return cameradetails;
	}

	public void setCameradetails(String cameradetails) {
		this.cameradetails = cameradetails;
	}

	public String toString() {
		return "model=" + model +"\t"+ " price=" + price +"\t"+ " color=" + color +"\t"+ " processor=" + processor
		+"\t"+ " ram=" + ram +"\t"+ " noofcamera=" + noofcamera +"\t"+ " length=" + length + "\t"+" storage=" + storage
		+"batterycapacity="+batterycapacity+"\t"+"cameradetails="+cameradetails;
	}
	
}

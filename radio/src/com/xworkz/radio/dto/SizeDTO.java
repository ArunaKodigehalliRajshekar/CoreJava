package com.xworkz.radio.dto;

public class SizeDTO {
	float height;
	double length;
	double width;
	byte weight;
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public byte getWeight() {
		return weight;
	}
	public void setWeight(byte weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "SizeDTO [height=" + height + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	
	
	

}

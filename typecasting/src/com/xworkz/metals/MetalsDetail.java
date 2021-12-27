package com.xworkz.metals;

public class MetalsDetail {
	public float weight;
	public String color;
	public float thickness;
	public boolean shining;
	public int price;
	
	public MetalsDetail() {
		System.out.println("envoking default metaldetail contructor");
	}
	
	public MetalsDetail(float weight,String color,float thickness,boolean shining,int price) {
		this.weight=weight;
		this.color=color;
		this.thickness=thickness;
		this.shining=shining;
		this.price=price;
		System.out.println("envoking parameterised constructor()");
		
	}
	
//	public MetalsDetail(String conductivity) {
//		System.out.println("metal having property of conducting electricity & heat");
//		
//	}
//	

}

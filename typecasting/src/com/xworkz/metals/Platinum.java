package com.xworkz.metals;

public class Platinum extends MetalsDetail{
	public String chemicalname;
	public byte atomicnumber;
	public float electronegativity;
	public float density;
	public int meltingpoint;
	public int boilingpoint;
	
	public Platinum() {
		System.out.println("envoking platinum default constructor");
	}
	
	public Platinum(String chemicalname,byte atomicnumber,float electronegativity,float density,int meltingpoint,
			int boilingpoint) {
		super();
		this.chemicalname=chemicalname;
		this.atomicnumber=atomicnumber;
		this.electronegativity=electronegativity;
		this.density=density;
		this.meltingpoint=meltingpoint;
		this.boilingpoint=boilingpoint;
		System.out.println("envoking platinum parameterised constructor");
	}

}

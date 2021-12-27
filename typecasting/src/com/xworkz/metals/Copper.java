package com.xworkz.metals;

public class Copper extends MetalsDetail{
	public String chemicalname="cu";
	public byte atomicnumber =29;
	public float density=8.9f;
	public int meltingpoint=1083;
	public int boilingpoint=2595;
	
	public Copper() {
		this("cu",(byte)29,8.9f,1083,2595);
		System.out.println("envoking the default constructor copper()");
	}
	
	public Copper(String chemicalname,byte atomicnumber,float density,int meltingpoint,int boilingpoint) {
		super();
		this.chemicalname=chemicalname;
		this.atomicnumber=atomicnumber;
		this.density=density;
		this.meltingpoint=meltingpoint;
		this.boilingpoint=boilingpoint;
		
		System.out.println("envoking copper  constructor");
	}

}

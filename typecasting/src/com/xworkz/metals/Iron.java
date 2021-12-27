package com.xworkz.metals;

public class Iron extends MetalsDetail{

	public String chemicalname;
	public byte atomicnumber;//26
	public float density;//7.86
	public int meltingpoint;//1536
	public float electronegativity;//1.86
	public int boilingpoint;//2861
	
	public Iron() {
		
		System.out.println("envoking the iron default constructor()");
	}
	
	public Iron(String chemicalname,byte atomicnumber,float density,int meltingpoint,float electronegativity,int boilingpoint) {
	 super();
	 this.chemicalname=chemicalname;
	 this.atomicnumber=atomicnumber;
	 this.density=density;
	 this.meltingpoint=meltingpoint;
	 this.electronegativity=electronegativity;
	 this.boilingpoint=boilingpoint;
	 
	 System.out.println("envoking parameterised constructor");
	}
}

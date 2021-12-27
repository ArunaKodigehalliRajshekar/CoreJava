package com.xworkz.metals;

public class Silver extends MetalsDetail{
	
	public String chemicalname;
	public byte atomicnumber;//47
	public int meltingpoint;//962
	public float atomicmass;//107.87
	public byte noofvalenceelectrons;//3
	public int boilingpoint;//2212
	
	
	public Silver() {
		System.out.println("envoking the silver properties");
	}
	
	public Silver(String chemicalname,byte atomicnumber,int meltingpoint,float atomicmass,byte noofvalenceelectrons,
			int boilingpoint){
		super();
		this.chemicalname=chemicalname;
		this.atomicnumber=atomicnumber;
		this.meltingpoint=meltingpoint;
		this.atomicmass=atomicmass;
		this.noofvalenceelectrons=noofvalenceelectrons;
		this.boilingpoint=boilingpoint;
		
		System.out.println("envoking the silver parameterised constructor");
		
	}

}

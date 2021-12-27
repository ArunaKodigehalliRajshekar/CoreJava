package com.xworkz.metals;

public class Gold extends MetalsDetail{
	public float automicweight=196.66f; //196.66f
	public String chemicalname="au" ;//"au"
	public float automicnumber=79.02f;//79.02f
	public byte noofvalenceelectrons=01;
	public short meltingpoint=1064; //1064
	
	public Gold() {
		this(196.66f,"au",79.02f,(byte)01,(short)1064);
		System.out.println("envoking default constructor gold");
	}
	
	public Gold(float automicweight,String chemicalname,float automicnumber,byte noofvalenceelectrons,short meltingpoint) {
		super();
		this.automicweight=automicweight;
		this.chemicalname=chemicalname;
		this.automicnumber=automicnumber;
		this.noofvalenceelectrons=noofvalenceelectrons;
		this.meltingpoint=meltingpoint;
		
		
		System.out.println("envoking parameterised constructor");
	}
	

}

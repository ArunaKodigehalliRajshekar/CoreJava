package com.xworkz;

import com.xworkz.metals.Gold;
import com.xworkz.metals.MetalsDetail;

public class TestGold {
	public static void main(String[] args) {
		
		Gold gold =new Gold();
		System.out.println(gold.automicweight);
		System.out.println(gold.weight);
		System.out.println(gold.color);
		System.out.println(gold.chemicalname);
		System.out.println(gold.thickness);
		System.out.println(gold.automicnumber);
		System.out.println(gold.shining);
		System.out.println(gold.noofvalenceelectrons);
		System.out.println(gold.price);
		System.out.println(gold.meltingpoint);
		System.out.println();
		
		System.out.println("printing gold class properties");
		Gold gold1 =new Gold(196.66f,"au",79.02f,(byte)01,(short)1064);
		System.out.println(gold1.chemicalname);
		System.out.println(gold1.automicweight);
		System.out.println(gold1.automicnumber);
		System.out.println(gold1.noofvalenceelectrons);
		System.out.println(gold1.meltingpoint);
		System.out.println(gold1.color);
		System.out.println(gold1.shining);
		System.out.println(gold1.weight);
		System.out.println(gold1.thickness);
		System.out.println(gold1.price);
		System.out.println();
		System.out.println("printing metaldetails properties---");
		
		MetalsDetail metal =new MetalsDetail();
		System.out.println(metal.color);
		System.out.println(metal.shining);
		System.out.println(metal.weight);
		System.out.println(metal.thickness);
		System.out.println(metal.price);
		
		System.out.println();
		System.out.println("downcasting-----");
		MetalsDetail metal1=new Gold(196.66f,"au",79.02f,(byte)01,(short)1064);
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.shining);
		System.out.println(metal1.weight);
		System.out.println(metal1.thickness);
		
		System.out.println();
		System.out.println("upcasting------");
		Gold gold2=(Gold)metal1;
		System.out.println(gold2.color);
		System.out.println(gold2.price);
		System.out.println(gold2.shining);
		System.out.println(gold2.weight);
		System.out.println(gold2.thickness);
		System.out.println(gold2.noofvalenceelectrons);
		System.out.println(gold2.chemicalname);
		System.out.println(gold2.automicnumber);
		System.out.println(gold2.noofvalenceelectrons);
		System.out.println(gold2.meltingpoint);
		
		
	}

}

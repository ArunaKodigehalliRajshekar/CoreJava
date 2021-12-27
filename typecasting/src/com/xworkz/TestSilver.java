package com.xworkz;

import com.xworkz.metals.MetalsDetail;
import com.xworkz.metals.Silver;

public class TestSilver {
    public static void main(String []args) {
    	
    	Silver silver =new Silver("Ag",(byte)47,962,107.87f,(byte)03,2212);
    	System.out.println("metal weight"+"\t"+silver.weight);
    	System.out.println("silver chemicalname" +"\t"+silver.chemicalname);
    	System.out.println("metal weight"+"\t"+silver.color);
    	System.out.println("silver atomic no" +"\t"+silver.atomicnumber);
    	System.out.println("metal thickness"+"\t"+silver.thickness);
    	System.out.println("silver melting point" +"\t"+silver.meltingpoint);
    	System.out.println("metal shining"+"\t"+silver.shining);
    	System.out.println("silver atomicmass"+"\t"+silver.atomicmass);
    	System.out.println("metal price"+"\t"+silver.price);
    	System.out.println("silver noofvalenceelectrons"+"\t"+silver.noofvalenceelectrons);
    	System.out.println("silver boilingpoint" +"\t"+silver.boilingpoint);
    	
 
    	
System.out.println();
        MetalsDetail metal =new MetalsDetail();
        System.out.println(metal.color);
        System.out.println(metal.shining);
        System.out.println(metal.weight);
        System.out.println(metal.thickness);
         System.out.println(metal.price);
        System.out.println();
        System.out.println();
        MetalsDetail metal2=new Silver("Ag",(byte)47,962,107.87f,(byte)03,2212);
		System.out.println(metal2.price);
		System.out.println(metal2.color);
		System.out.println(metal2.shining);
		System.out.println(metal2.weight);
		System.out.println(metal2.thickness);
		System.out.println();
       Silver silver1=(Silver)metal2;
       System.out.println("metal weight"+"\t"+silver1.weight);
   	System.out.println("silver chemicalname" +"\t"+silver1.chemicalname);
   	System.out.println("metal weight"+"\t"+silver1.color);
   	System.out.println("silver atomic no" +"\t"+silver1.atomicnumber);
   	System.out.println("metal thickness"+"\t"+silver1.thickness);
   	System.out.println("silver melting point" +"\t"+silver1.meltingpoint);
   	System.out.println("metal shining"+"\t"+silver1.shining);
   	System.out.println("silver atomicmass"+"\t"+silver1.atomicmass);
   	System.out.println("metal price"+"\t"+silver1.price);
   	System.out.println("silver noofvalenceelectrons"+"\t"+silver1.noofvalenceelectrons);
   	System.out.println("silver boilingpoint" +"\t"+silver1.boilingpoint);
   	



    }
	
}

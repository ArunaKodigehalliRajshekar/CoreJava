package com.xworkz;

import com.xworkz.metals.Copper;
import com.xworkz.metals.MetalsDetail;

public class TestCopper {
	public static void main(String[] args) {
		
		Copper copper =new Copper("cu",(byte)29,8.9f,1083,2595);
		System.out.println("metal weight is"+"\t" +copper.weight);
		System.out.println("copper name"+"\t" +copper.chemicalname);
		System.out.println("metal color"+"\t" +copper.color);
		System.out.println("copper atomic no" +"\t"+copper.atomicnumber);
		System.out.println("metal thickness"+"\t" +copper.thickness);
		System.out.println("copper density is"+"\t" +copper.density);
		System.out.println("metal shining"+"\t" +copper.shining);
		System.out.println("copper melting point"+"\t" +copper.meltingpoint);
		System.out.println("metal price" +"\t"+copper.price);
		System.out.println("copper boiling point"+"\t" +copper.boilingpoint);
		System.out.println();
		MetalsDetail detail = new MetalsDetail();
		System.out.println("metal weight is"+"\t" +detail.weight);
		System.out.println("metal color"+"\t" +detail.color);
		System.out.println("metal thickness"+"\t" +detail.thickness);
		System.out.println("metal shining"+"\t" +detail.shining);
		System.out.println("metal price" +"\t"+detail.price);
		//System.out.println("copper boiling point"+"\t" +detail.boilingpoint);
		System.out.println();
		MetalsDetail detail1 =new Copper("cu",(byte)29,8.9f,1083,2595);
		System.out.println("metal weight is"+"\t" +detail1.weight);
		System.out.println("metal color"+"\t" +detail1.color);
		System.out.println("metal thickness"+"\t" +detail1.thickness);
		System.out.println("metal shining"+"\t" +detail1.shining);
		System.out.println("metal price" +"\t"+detail1.price);
		//System.out.println("copper boiling point"+"\t" +detail1.boilingpoint);
		System.out.println();
		Copper copper1 =(Copper)detail1;
		System.out.println("metal weight is"+"\t" +copper1.weight);
		System.out.println("copper name"+"\t" +copper1.chemicalname);
		System.out.println("metal color"+"\t" +copper1.color);
		System.out.println("copper atomic no" +"\t"+copper1.atomicnumber);
		System.out.println("metal thickness"+"\t" +copper1.thickness);
		System.out.println("copper density is"+"\t" +copper1.density);
		System.out.println("metal shining"+"\t" +copper1.shining);
		System.out.println("copper melting point"+"\t" +copper1.meltingpoint);
		System.out.println("metal price" +"\t"+copper1.price);
		System.out.println("copper boiling point"+"\t" +copper1.boilingpoint);
		
		
		
	}

}

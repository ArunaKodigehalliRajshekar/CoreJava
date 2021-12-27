package com.xworkz;

import com.xworkz.metals.MetalsDetail;
import com.xworkz.metals.Platinum;

public class TestPlatinum {
	public static void main(String[] args) {
		
		Platinum platinum =new Platinum("pt",(byte)78,2.23f,21.4f,1772,3800);
		System.out.println("metal weight"+"\t"+platinum.weight);
		System.out.println("platinum chemical name"+"\t"+platinum.chemicalname);
		System.out.println("matal color"+"\t"+platinum.color);
		System.out.println("platinum atomicnumber"+"\t"+platinum.atomicnumber);
		System.out.println("metal thickness"+"\t"+platinum.thickness);
		System.out.println("platinum electronegativity"+"\t"+platinum.electronegativity);
		System.out.println("metal shining"+"\t"+platinum.shining);
		System.out.println("platinum density"+"\t"+platinum.density);
		System.out.println("metal price"+"\t"+platinum.price);
		System.out.println("platinum meltingpoint"+"\t"+platinum.meltingpoint);
		System.out.println("platinum boilingpoint"+"\t"+platinum.boilingpoint);
		System.out.println();
		
		MetalsDetail metal = new MetalsDetail();
		System.out.println("metal weight"+"t"+metal.weight);
		System.out.println("metal color"+"\t"+metal.color);
		System.out.println("metal thickness"+"\t"+metal.thickness);
		System.out.println("metal shining"+"\t"+metal.shining);
		System.out.println("metal price"+"\t"+metal.price);
		System.out.println();
		MetalsDetail metal1 =new Platinum("pt",(byte)78,2.23f,21.4f,1772,3800);
		
	System.out.println("metal weight"+"t"+metal1.weight);
	System.out.println("metal color"+"\t"+metal1.color);
	System.out.println("metal thickness"+"\t"+metal1.thickness);
		System.out.println("metal shining"+"\t"+metal1.shining);
		System.out.println("metal price"+"\t"+metal1.price);
		System.out.println();
		
		Platinum platinum1 =(Platinum)metal1;
		System.out.println("metal weight"+"\t"+platinum1.weight);
		System.out.println("platinum chemical name"+"\t"+platinum1.chemicalname);
		System.out.println("matal color"+"\t"+platinum1.color);
		System.out.println("platinum atomicnumber"+"\t"+platinum1.atomicnumber);
		System.out.println("metal thickness"+"\t"+platinum1.thickness);
		System.out.println("platinum electronegativity"+"\t"+platinum1.electronegativity);
		System.out.println("metal shining"+"\t"+platinum1.shining);
		System.out.println("platinum density"+"\t"+platinum1.density);
		System.out.println("metal price"+"\t"+platinum1.price);
		System.out.println("platinum meltingpoint"+"\t"+platinum1.meltingpoint);
		System.out.println("platinum boilingpoint"+"\t"+platinum1.boilingpoint);
	}

}

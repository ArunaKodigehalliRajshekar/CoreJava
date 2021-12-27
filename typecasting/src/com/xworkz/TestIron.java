package com.xworkz;

import com.xworkz.metals.Iron;
import com.xworkz.metals.MetalsDetail;

public class TestIron {
	public static void main(String[] args) {
		
		Iron iron = new Iron("Fe",(byte)26,7.86f,1536,1.86f,2861);
		System.out.println("metal color" +"\t"+iron.color);
		System.out.println("iron chemicalname"+"\t"+iron.chemicalname);
        System.out.println("shining of metal"+"\t"+iron.shining);
        System.out.println("iron atomicnumber"+"\t"+iron.atomicnumber);
        System.out.println("metal weight"+"\t"+iron.weight);
        System.out.println("iron density"+"\t"+iron.density);
        System.out.println("metal thickness"+"\t"+iron.thickness);
        System.out.println("iron meltingpoint"+"\t"+iron.meltingpoint);
         System.out.println("metal price"+"\t"+iron.price);
         System.out.println("iron conductivity"+"\t"+iron.electronegativity);
         System.out.println("iron boilingpoint"+"\t"+iron.boilingpoint);
		System.out.println();
		
		MetalsDetail metal =new MetalsDetail();
		System.out.println(metal.color);
        System.out.println(metal.shining);
        System.out.println(metal.weight);
        System.out.println(metal.thickness);
         System.out.println(metal.price);
        System.out.println();
        
        MetalsDetail metal1=new Iron("Fe",(byte)26,7.86f,1536,1.86f,2861);
        System.out.println(metal1.color);
        System.out.println(metal1.shining);
        System.out.println(metal1.weight);
        System.out.println(metal1.thickness);
         System.out.println(metal1.price);
        System.out.println();
        
        Iron iron1 =(Iron)metal1;
        System.out.println("metal color" +"\t"+iron1.color);
		System.out.println("iron chemicalname"+"\t"+iron1.chemicalname);
        System.out.println("shining of metal"+"\t"+iron1.shining);
        System.out.println("iron atomicnumber"+"\t"+iron1.atomicnumber);
        System.out.println("metal weight"+"\t"+iron1.weight);
        System.out.println("iron density"+"\t"+iron1.density);
        System.out.println("metal thickness"+"\t"+iron1.thickness);
        System.out.println("iron meltingpoint"+"\t"+iron1.meltingpoint);
         System.out.println("metal price"+"\t"+iron1.price);
         System.out.println("iron conductivity"+"\t"+iron1.electronegativity);
         System.out.println("iron boilingpoint"+"\t"+iron1.boilingpoint);
        
	}

}

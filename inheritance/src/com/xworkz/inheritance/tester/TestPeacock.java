package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Peacock;

public class TestPeacock {
	public static void main(String []args) {
		
		Peacock peacock = new Peacock();
		
		System.out.println(peacock.color);
		System.out.println(peacock.weight);
		System.out.println(peacock.layingEgg);
		System.out.println(peacock.flyingDistance);
		System.out.println(peacock.length);
		System.out.println(peacock.swim);
		System.out.println(peacock.height);
		System.out.println(peacock.nooflegs);
		
		String res = peacock.dance("peacock-dance");
		System.out.println("peacock will dance" +"\t"+res);
		
		float res1 = peacock.flyingDistance(17.63f);
		System.out.println("heighest distance bird can fly"+"\t" +res1);
		
		boolean res2 = peacock.swim(true);
		System.out.println("some of birds can swim"+"\t" +res2);
		
		boolean res3 = peacock.layingEgg(true);
		System.out.println("all birds are laying eggs"+"\t" +res3);
		
		boolean res4 = peacock.layingEgg(true);
		System.out.println("peacock is egglaying"+"\t" +res4);
		
		String res5 = peacock.speerch("peacock-Spreech");
		System.out.println("peacock can screep" +"\t" +res5);
		
		
		
	}

}

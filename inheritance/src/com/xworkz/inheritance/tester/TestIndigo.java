package com.xworkz.inheritance.tester;

import com.xworkz.inheritance.airlines.Indigo;

public class TestIndigo {
	public static void main(String []args) {
		
		Indigo indigo1 =new Indigo(158962145502l);
		Indigo indigo =new Indigo();
		
		System.out.println(indigo.purpose);
		System.out.println(indigo.firstCompany);
		System.out.println(indigo.yearoffoundation);
		System.out.println(indigo.globalGDP);
		System.out.println(indigo.price);
		
		String air1 = indigo.emphasis("wide buisness");
		System.out.println("airline is one of" +air1);
		
		String air2 =indigo.types("national or international");
		System.out.println("types of airlines mainly" +air2);
		
		String air3 =indigo.biggestAirline("amrican airlines");
		System.out.println("the biggest airline is"  +air3);
		
		String air4 =indigo.buisnessModel("full service carrier");
		System.out.println("the main buisness model"  +air4);
		
		String air5=indigo.website("book in online");
		System.out.println("for booking tickets we can "+ air5);
		
		System.out.println(indigo.founded);
		System.out.println(indigo.fleetSize);
		System.out.println(indigo.destinations);
		System.out.println(indigo.founder);	
		System.out.println(indigo.revenue);
		
		int ind1 =indigo.noofemployees(23711);
		System.out.println("employees in indigo are"  +ind1);
		
		byte ind2 =indigo.noofdestinations((byte)95);
		System.out.println("number of destinations were"  +ind2);
		
		String ind3=indigo.airbusname("BSE:539448");
		System.out.println("name of the airbus"  +ind3);
		
		String ind4=indigo.newDomesticRule("inigo commits to ordering 150 airbus");
		System.out.println("the new rule "   +ind4);
		
		String ind5=indigo.tiesForEntertainment("ties with sony");
		System.out.println("for entertainig purpose indigo  " +ind5);
	}

}

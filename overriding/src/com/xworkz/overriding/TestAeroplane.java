package com.xworkz.overriding;

import com.xworkz.overriding.inheritoverriding.Aeroplane;
import com.xworkz.overriding.inheritoverriding.Transportation;

public class TestAeroplane {
	public static void main(String[] args) {
		
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.travelling();
		aeroplane.inFlightEntertainment();
		aeroplane.premiumEconomy();
		aeroplane.timeconvinient() ;
		aeroplane.carryGoods();
		System.out.println();
		
		Transportation transportation = new Transportation();
		transportation.travelling();
		transportation.timeconvinient() ;
		transportation.carryGoods();
		System.out.println();
		
		Transportation transport = new Aeroplane();
		transport.travelling();
		transport.timeconvinient() ;
		transport.carryGoods();
		System.out.println();
		
		Aeroplane aeroplane1 =(Aeroplane)transport;
		aeroplane1.travelling();
		aeroplane1.inFlightEntertainment();
		aeroplane1.premiumEconomy();
		aeroplane1.timeconvinient() ;
		aeroplane1.carryGoods();
	}

}

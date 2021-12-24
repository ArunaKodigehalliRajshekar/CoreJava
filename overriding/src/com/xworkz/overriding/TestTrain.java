package com.xworkz.overriding;

import com.xworkz.overriding.inheritoverriding.Train;
import com.xworkz.overriding.inheritoverriding.Transportation;

public class TestTrain {
	public static void main(String[] args) {
		
		Train train = new Train();
		train.sourceOfTransport();
		train.timeconvinient();
		train.chanceOfAccident();
		train.travelling();
		train.carryGoods();
		System.out.println("engine type "+train.enginetype);
		System.out.println("length of the train"+train.length);
		System.out.println("number of compartments"+train.noofcompartment);
		System.out.println("coach type we prefer"+train.coachtype);
		System.out.println();
		
		Transportation transportation = new Transportation();
		transportation.timeconvinient();
		transportation.travelling();
		transportation.carryGoods();
		
		System.out.println();
		Transportation transport =new Train();
		transport.timeconvinient();
		transport.travelling();
		transport.carryGoods();
		System.out.println();
		
		Train train1 =(Train)transport;
		train1.sourceOfTransport();
		train1.timeconvinient();
		train1.chanceOfAccident();
		train1.travelling();
		train1.carryGoods();
		System.out.println(train1.money);
		System.out.println(train1.noofcompartment);
	}

}

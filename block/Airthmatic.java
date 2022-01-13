package com.xworkz.execptions.block;

public class Airthmatic {
	public static void main(String[] args) {
		
		int num=100 ,div;
		try {
		div=num/0;
		
		System.out.println(div);
		}
		catch (ArithmeticException exception) {
			System.err.println(exception.getMessage());
			
		}
		
	}

}

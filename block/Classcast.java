package com.xworkz.execptions.block;

public class Classcast {
	public static void main(String[] args) {
		
		Object obj = new Object();
		try {
		String str = (String)obj;
		System.out.println(str);
		}
		catch (ClassCastException exception) {
			System.err.println(exception.getMessage());
		}
		
		
	}

}

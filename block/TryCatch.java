package com.xworkz.execptions.block;

public class TryCatch {
	
	 static String[] arry =  new String[]{"aruna","kumar",null,"soma","shashi"};
	
	public static void main(String[] args) {
		
		System.out.println(arry[0].toUpperCase());
		System.out.println(arry[1].toUpperCase());
		try {
		System.out.println(arry[2].toUpperCase());
		}
		catch (NullPointerException exception) {
			System.err.println(exception);
		}
		System.out.println(arry[3].toUpperCase());
		System.out.println(arry[4].toUpperCase());
		
	}

}

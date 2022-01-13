package com.xworkz.execptions.block;

public class ArrayOB {
	
	static int num[] = {8,5,5,0,0,7,1,4,2,3};
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= num.length; i++) {
			try {
			System.out.println(num[i]);
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.err.println(exception.getMessage());
			}
		}
		
	}

}

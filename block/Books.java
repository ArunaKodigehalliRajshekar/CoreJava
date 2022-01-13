package com.xworkz.execptions.block;

public class Books {
	public static String name ="arun";
	
	public Books() {
		//static {
			
		//}
		System.out.println("books are main source of knowledge");
		{
			System.out.println("instance block inside the constructor ");
		}
	
	}
	
	static {
		//static {
			
		//}
		System.out.println("envoking the static block");
		
	
		{
			System.out.println("instance block inside static");
		}
	}
	static{
		
	}
	
	{
		//static {
			
		//}
		System.out.println("envoking the instance block");
	}
	{
		System.out.println("inside instance");
	}

}

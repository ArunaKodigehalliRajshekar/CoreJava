package com.xworkz.inheritance.instituteDTO;

public class Xworkz extends Institute{
	public String director="Omkar";
	public byte noofBranches =2;
	public String hr="akshara";
	public int fees=25000;
	public byte durationofCourse=06;
	
	public Xworkz() {
		super();
		//this("rajajinagar");
		System.out.println("xworkz is training center to train students");
		
	}
	public Xworkz(String location) {
		this();
		//super();
		System.out.println("location of xworkz is" +location);
		
	}
	
	public String developers(String developers) {
		return developers;
	}
	
	public String firstCourse(String firstcourse) {
		return firstcourse;
	}
	
	public String secondCourse(String secondcourse) {
		return secondcourse;
	}
	
	public String tasks(String tasks) {
		return tasks;
	}
	
	public String goodChoice(String goodchoice) {
		return goodchoice;
	}

}

package com.xworkz.inheritance.instituteDTO;

public class Institute {
	public String name="institute name";
	public String location="institute location";
	public String branches="instituteBranches";
	public String vision ="institute Vision";
	public String mission ="institute mission";
	
	public Institute() {
		System.out.println("institute mainly used to teach students");
	}
	
	public String coaching(String coaching) {
		return coaching;
	}
	
	public String placement(String placement) {
		return placement;
	}
	
	public String curicularActivity(String activity) {
		return activity;
	}
	
	public String assaignments(String assaignments) {
		return assaignments;
	}
	
	public String instituteTrip(String trip) {
		return trip;
	}
	

}

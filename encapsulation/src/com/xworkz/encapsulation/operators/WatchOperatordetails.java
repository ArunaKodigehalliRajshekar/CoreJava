package com.xworkz.encapsulation.operators;

import com.xworkz.encapsulation.OneplusWatchdetailsDTO;

public class WatchOperatordetails {
	
	OneplusWatchdetailsDTO[] names = new OneplusWatchdetailsDTO[4];
	int index=0;
	
	public void add(OneplusWatchdetailsDTO name) {
		if(index<names.length) {
			names[index]=name;
			index++;
		}
	}
 
  public void printAll() {
	  for(int index=0;index<names.length;index++) {
		  System.out.println(names[index]);
	  }
  }

  public OneplusWatchdetailsDTO updateRamByModel(String model,short ram) {
	  OneplusWatchdetailsDTO watch = null;
	  for(int index=0;index<names.length;index++) {
		  if(names[index]!=null) {
		  if(model.equals(names[index].getModel())) {
			  names[index].setRam(ram);
			  watch=names[index];
		  }
			  
		  }
	  }
       return watch;
  }
  public OneplusWatchdetailsDTO deleteByModel(String model) {
	  OneplusWatchdetailsDTO watch = null;
	  for(int index=0;index<names.length;index++) {
		  if(names[index]!=null) {
		  if(model.equals(names[index].getModel())) {
			  names[index]=null;
			  watch=names[index];
		  }
			  
		  }
	  }
       return watch;
}
}

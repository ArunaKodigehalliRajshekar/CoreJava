package com.xworkz.operations.dtoDetails;

public class Butterflyoperatordetails {
	ButterflydetailsDTO[]  butterfly =new ButterflydetailsDTO[4];
	int index=0;
	
	public void flying(ButterflydetailsDTO type) {
		if(index<butterfly.length) {
			butterfly[index]=type;
			index++;
		}
	}
      public void getAll() {
    	  for(int index=0;index<butterfly.length;index++) {
    		  if(butterfly[index]!=null) {
    		  System.out.println(butterfly[index].printAll());
    		    }
    		  }
      }

    public ButterflydetailsDTO updateheightusingname(String name,float height) {
    	ButterflydetailsDTO detailsdto =null;
    	for(int index=0;index<butterfly.length;index++) {
    		if(name.equals(butterfly[index].name)) {
    			butterfly[index].height=height;
    			detailsdto=butterfly[index];
    		}
    	}
         return detailsdto;
    }
    public ButterflydetailsDTO delete(String name) {
    	ButterflydetailsDTO detailsdto =null;
    	for(int index=0;index<butterfly.length;index++) {
    		if(name.equals(butterfly[index].name)) {
    			butterfly[index]=null;
    			detailsdto=butterfly[index];
    		}
    	}
         return detailsdto;
    }
}

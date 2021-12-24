package com.xworkz.encapsulation;

public class Oneplusoperationdetails {
	
	OneplusearphoneDTO[] earphone = new OneplusearphoneDTO[3];
	int index=0;
	
	public void collect(OneplusearphoneDTO name) {
		if(index<earphone.length) {
			earphone[index]=name;
			index++;
		}
	}
      public void getAll() {
    	  for(int index=0;index<earphone.length;index++) {
    		  if(earphone[index]!=null) {
    		  System.out.println(earphone[index].printAll());
    		  }
    	  }
      }
	public OneplusearphoneDTO updateProcessorByModel(String model,String processor) {
		OneplusearphoneDTO oneplus =null;
		for(int index=0;index<earphone.length;index++) {
			if(model.equals(earphone[index].getModel())) {
				earphone[index].setProcessor(processor);
				oneplus=earphone[index];
			}
		}
		return oneplus;
	}
	public OneplusearphoneDTO deleteByModel(String model) {
		OneplusearphoneDTO oneplus =null;
		for(int index=0;index<earphone.length;index++) {
			if(model.equals(earphone[index].getModel())) {
				earphone[index]=null;
				oneplus=earphone[index];
			}
		}
		return oneplus;
   }

	
		
	
}

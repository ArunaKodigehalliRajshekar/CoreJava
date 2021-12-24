package com.xworkz.operations.dtoDetails;

public class TransportDTO {
	String vehicletype;
	String vehicle;
	int priceofvehicle;
	String color;
	String destiny;
	
	public TransportDTO(String vehicletype,String vehicle,int priceofvehicle,String color,String destiny) {
		
		this.vehicletype=vehicletype;
		this.vehicle=vehicle;
		this.priceofvehicle=priceofvehicle;
		this.color=color;
		this.destiny=destiny;
	}

     public String printAll() {
    	 
    	 return "vehicletype="+vehicletype +"\t"+"vehicle="+vehicle +"\t"+"priceofvehicle="+priceofvehicle+ "\t"+
      "color="+color+"\t"+"destiny="+destiny;
     }
}

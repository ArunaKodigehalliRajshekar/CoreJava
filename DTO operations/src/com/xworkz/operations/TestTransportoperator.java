package com.xworkz.operations;

import com.xworkz.operations.dtoDetails.TransportDTO;
import com.xworkz.operations.dtoDetails.Transportoperator;

public class TestTransportoperator {
    public static void main(String []args) {
    	
    	Transportoperator operator = new Transportoperator();
    	TransportDTO dto = new TransportDTO("motorcycle","unicorn",110000,"cementblack","tumkur");
    	TransportDTO dto1 = new TransportDTO("car","skoda",1500000,"cementblack","sira");
    	TransportDTO dto2 = new TransportDTO("bus","ksrtc",1000000,"red","mysore");
    	TransportDTO dto3 = new TransportDTO("car","ertiga",1200000,"black","banglore");
    	
    	operator.travel(dto);
    	operator.travel(dto1);
    	operator.travel(dto2);
    	operator.travel(dto3);
    	
    	operator.getAll();
    	System.out.println();
    	TransportDTO dlt = operator.updatevehicleusingcolor("unicorn","red_black");
    	System.out.println(dlt);
    	operator.getAll();
    	System.out.println();
    	System.out.println(operator.delete("skoda"));
    	operator.getAll();
    	
    }
}

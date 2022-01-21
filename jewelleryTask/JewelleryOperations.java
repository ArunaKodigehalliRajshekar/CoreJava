package com.xworkz.execptions.block.jewelleryTask;

public class JewelleryOperations {
	
    JewlleryDetailsDTO[] details = new JewlleryDetailsDTO[5];	
    
    int index=0;
    
    public void add(JewlleryDetailsDTO names) {
    	if(index<details.length ) {
    		details[index]=names;
    		index++;
    	}else {
    }
    }
    
    public void printAll() {
    	for (int index = 0; index < details.length; index++) {
    		if(details[index]!=null) {
    			try {
    	    		System.out.println(details[index].toString());
    	    		}
    	    		catch (NullPointerException e) {
    					System.err.println(e.getMessage());
    				}
    		}//else {
    			//throw new ThrowExecp("input must not be null");
    		//}
    	}
    		
			
		}
    
    public JewlleryDetailsDTO updatePriceByJeweltype(String jeweltype , int price) {
    	boolean check = false;
    	for (int index = 0; index < details.length; index++) {
    		if(jeweltype.equals(details[index].getJeweltype())) {
    			details[index].setPrice(price);
    			check=true;
    			System.out.println("value updated");
    		}if(check == false) {
    			throw new UpdateNameExecp("Entered name is missmatch");
    		}
			
		}
    	return null;
    }
    
    public JewlleryDetailsDTO getByMetaltype(String metaltype) {
    	JewlleryDetailsDTO dto = null;
    	//boolean check = false;
    	for (int index = 0; index < details.length; index++) {
    		if(metaltype.equals(details[index].getMetaltype())) {
    				dto= details[index];
    				//check=true;
    				System.out.println("value geted by metaltype");
//    			}if(check==false) {
//    				throw new GetMethodExecp("entered name missmatch");
//    			}
		
    	return dto;
    		}
    	}
    	return null;
    }
    
    public JewlleryDetailsDTO updateMetaltypeBymaterials(String metaltype, String materials) {
    	JewlleryDetailsDTO dto1=null;
    	boolean check = false;
    	for (int index = 0; index < details.length; index++) {
    		if(metaltype .equals(details[index].getMetaltype())) {
    			details[index].setMaterials(materials);
    			dto1=details[index];
    			check=true;
    			System.out.println("metaltype is updated by material");
    		}
			
		}
    	return dto1;
    }
    
    public String deleteByJeweltype(String jeweltype) {
    	boolean check = false;
    	for (int index = 0; index < details.length; index++) {
    		if(jeweltype.equals(details[index].getJeweltype())) {
    			details[index]=null;
    			check=true;
    			System.out.println("deleted sussesfuly");
    		}
			
		}
    	return "value deleted";
    }
    
    }



package com.xworkz.execptions.block.jewelleryTask;

public class TestJewelleryOperations {
	
	public static void main(String[] args) {
		
		JewlleryDetailsDTO dto = new JewlleryDetailsDTO();
		JewlleryDetailsDTO dto1 = new JewlleryDetailsDTO();
		dto.setMetaltype("Gold");
		dto.setJeweltype("Necalase");
		dto.setPrice(65000);
		dto.setColor("goldenColor");
		dto.setMaterials("coral");
		dto.setWeight(54.6f);
		dto.setDesign("archDesign");
		dto.setCarats(24.2f);
		
		dto1.setMetaltype("platinum");
		dto1.setJeweltype("Ring");
		dto1.setPrice(85000);
		dto1.setColor("silver");
		dto1.setMaterials("Gemstones");
		dto1.setWeight(5.62f);
		dto1.setDesign("roundArchid");
		dto1.setCarats(621.4f);
		
		
		JewelleryOperations operation = new JewelleryOperations();
		operation.add(dto);
		operation.add(dto1);
		operation.printAll();
		System.out.println();
		try {
		JewlleryDetailsDTO upd=operation.updatePriceByJeweltype("Necalase", 100000);
		System.out.println(upd.toString());
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		System.out.println();
		
		try {
		JewlleryDetailsDTO get = operation.getByMetaltype("platinum");
		System.out.println(get.toString());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		try {
		JewlleryDetailsDTO upd1 = operation.updateMetaltypeBymaterials("platinum", "coral");
		System.out.println(upd1.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		operation.printAll();
		System.out.println();
		
		try {
	  String  del = operation.deleteByJeweltype("Necalase");
	  System.out.println(del);
		}catch (Exception e) {
			// TODO: handle exception
		}
	  
	  operation.printAll();
	}

}

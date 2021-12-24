package com.xworkz.radio;

import com.xworkz.radio.dao.RadiodetailsDAO;
import com.xworkz.radio.dto.RadiodetailsDTO;
import com.xworkz.radio.dto.SizeDTO;

public class TestRadio {
	public static void main(String []args) {
		
		RadiodetailsDTO detailsdto = new RadiodetailsDTO();
		RadiodetailsDTO detailsdto1 = new RadiodetailsDTO();
		RadiodetailsDTO detailsdto2 = new RadiodetailsDTO();
		
		detailsdto.setCompany("Ajantha");
		detailsdto.setColor("grey");
		detailsdto.setPrice(800);
		detailsdto.setNoOfStation((byte)14);
		detailsdto.setFrequency(45.5f);
		
		detailsdto1.setCompany("Bajaj");
		detailsdto1.setColor("black");
		detailsdto1.setPrice(950);
		detailsdto1.setNoOfStation((byte)18);
		detailsdto1.setFrequency(45.5f);
		
		detailsdto2.setCompany("IRVP");
		detailsdto2.setColor("cement-black");
		detailsdto2.setPrice(550);
		detailsdto2.setNoOfStation((byte)13);
		detailsdto2.setFrequency(40.5f);
		
		SizeDTO dto = new SizeDTO();
		dto.setHeight(21.8f);
		dto.setLength(15.65);
		dto.setWidth(8.54);
		dto.setWeight((byte)2);
		
		SizeDTO dto1 = new SizeDTO();
		dto1.setHeight(21.8f);
		dto1.setLength(15.65);
		dto1.setWidth(8.54);
		dto1.setWeight((byte)3);
		
		SizeDTO dto2 = new SizeDTO();
		dto2.setHeight(18.8f);
		dto2.setLength(11.65);
		dto2.setWidth(6.54);
		dto2.setWeight((byte)1);
		
		detailsdto.setSize(dto);
		detailsdto1.setSize(dto1);
		detailsdto2.setSize(dto2);
		System.out.println(detailsdto.getColor());
		System.out.println(detailsdto1.getCompany());
		System.out.println();
		RadiodetailsDAO dao = new RadiodetailsDAO();
		dao.add(detailsdto);
		dao.add(detailsdto1);
		dao.add(detailsdto2);
		dao.printAll();
		System.out.println();
		RadiodetailsDTO upd1=dao.updateNoofStationByCompany("Ajantha",(byte)16);
		System.out.println(upd1.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		RadiodetailsDTO upd2=dao.updateFrequencyByColor("cement-black",45.5f);
		System.out.println(upd2.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		RadiodetailsDTO get =dao.getByColor("black");
		System.out.println(get);
		System.out.println();
		RadiodetailsDTO get1 = dao.getByLength(11.65);
		System.out.println(get1);
		System.out.println();
		RadiodetailsDTO res=dao.deleteByCompany("Bajaj");
		System.out.println(res);
		dao.printAll();
		System.out.println();
		RadiodetailsDTO res1=dao.deleteByWeight((byte)1);
		System.out.println(res1);
		dao.printAll();
	}

}

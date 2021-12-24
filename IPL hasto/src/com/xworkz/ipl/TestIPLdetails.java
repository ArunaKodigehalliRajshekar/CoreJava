package com.xworkz.ipl;

import com.xworkz.ipl.dao.IploperationDAO;
import com.xworkz.ipl.dto.CaptainDTO;
import com.xworkz.ipl.dto.IPLdetailsDTO;


public class TestIPLdetails {
	public static void main(String []args) {
		
		IPLdetailsDTO detailsdto = new IPLdetailsDTO();
		IPLdetailsDTO detailsdto1 = new IPLdetailsDTO();
		IPLdetailsDTO detailsdto2 = new IPLdetailsDTO();
		
		CaptainDTO dto = new CaptainDTO();
		CaptainDTO dto1 = new CaptainDTO();
		CaptainDTO dto2 = new CaptainDTO();
		
		IploperationDAO dao1 = new IploperationDAO();
		
		
		
		detailsdto.setTeamname("RCB");
		detailsdto.setOwner("United-spirits");
		detailsdto.setCoach("SanjayBangar");
		detailsdto.setJersycolor("red-black");
		detailsdto.setNoofplayers((byte)11);
		
		detailsdto1.setTeamname("MI");
		detailsdto1.setOwner("Ambani");
		detailsdto1.setCoach("sachin-tendulkar");
		detailsdto1.setJersycolor("blue");
		detailsdto1.setNoofplayers((byte)11);
		
		detailsdto2.setTeamname("KKR");
		detailsdto2.setOwner("sharukhan");
		detailsdto2.setCoach("daniels");
		detailsdto2.setJersycolor("liteBlue");
		detailsdto2.setNoofplayers((byte)11);
		
		dto.setName("kohili");
		dto.setYearOfExperience((byte)8);
		dto.setAcPrice(15000000l);
		
		dto1.setName("rohitSharma");
		dto1.setYearOfExperience((byte)12);
		dto1.setAcPrice(18000000l);
		
		dto2.setName("shreyas");
		dto2.setYearOfExperience((byte)4);
		dto2.setAcPrice(12000000l);
		
		detailsdto.setCaptain(dto);
		detailsdto1.setCaptain(dto1);
		detailsdto2.setCaptain(dto2);
		
		System.out.println(detailsdto.getTeamname());
		//System.out.println(detailsdto.toString());
		//System.out.println(detailsdto1.toString());
		dao1.add(detailsdto);
		dao1.add(detailsdto1);
		dao1.add(detailsdto2);
		dao1.printAll();
		System.out.println();
		IPLdetailsDTO upd=dao1.updateCoachByTeamname("KKR","Jakalis");
		System.out.println(upd.toString());
		System.out.println();
		dao1.printAll();
		System.out.println();
		IPLdetailsDTO upd1 = dao1.updateNoofplayersByTeamname("MI",(byte)13);
		System.out.println(upd1.toString());
		System.out.println();
		dao1.printAll();
		System.out.println();
		IPLdetailsDTO get=dao1.getByOwner("Ambani");
		System.out.println(get);
		System.out.println();
		IPLdetailsDTO get1=dao1.getByName("kohili");
		System.out.println(get1);
		System.out.println();
		IPLdetailsDTO resp=dao1.deleteByTeamname("MI");
		System.out.println(resp);
		dao1.printAll();
		System.out.println();
		IPLdetailsDTO resp1 = dao1.deleteByYearOfExperience((byte)4);
		System.out.println(resp1);
		dao1.printAll();
//		System.out.println(detailsdto.toString());
//		System.out.println(detailsdto1.toString());
//		
		
	}

}

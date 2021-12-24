package com.xworkz.motor;

import com.xworkz.motor.dao.MotordetailsDAO;
import com.xworkz.motor.dto.MotordetailsDTO;
import com.xworkz.motor.dto.SpecificationDTO;

public class TestMotorDTO {
	public static void main(String []args) {
		
		MotordetailsDTO details = new MotordetailsDTO();
		MotordetailsDTO details1 = new MotordetailsDTO();
		MotordetailsDTO details2 = new MotordetailsDTO();
		
		SpecificationDTO dto = new 	SpecificationDTO();
		SpecificationDTO dto1 = new 	SpecificationDTO();
		SpecificationDTO dto2 = new 	SpecificationDTO();
		
		
		details.setType("dc-Motor");
		details.setCompany("hurst-Motors");
		details.setColor("green");
		details.setWarrenty((byte)2);
		details.setNoofphase((byte)3);
		
		details1.setType("dc-Motor");
		details1.setCompany("bhorzvan-Motors");
		details1.setColor("blue");
		details1.setWarrenty((byte)2);
		details1.setNoofphase((byte)3);
		
		details2.setType("dc-Motor");
		details2.setCompany("electric-motorSolutions");
		details2.setColor("red");
		details2.setWarrenty((byte)2);
		details2.setNoofphase((byte)1);
		
		dto.setSpecifictype("dc-stepperMotor");
		dto.setVoltage((short)240);
		dto.setHorsepower((byte)3);
		dto.setCurrent((byte)5);
		dto.setFramesize((byte)35);
		dto.setStepangel(8.56f);
		
		dto1.setSpecifictype("dc-stepperMotor");
		dto1.setVoltage((short)240);
		dto1.setHorsepower((byte)5);
		dto1.setCurrent((byte)7);
		dto1.setFramesize((byte)55);
		dto1.setStepangel(14.56f);
		
		dto2.setSpecifictype("permanent-magnetDCmotors");
		dto2.setVoltage((short)220);
		dto2.setHorsepower((byte)7);
		dto2.setCurrent((byte)5);
		dto2.setFramesize((byte)65);
		dto2.setStepangel(15.56f);
		
		details.setSpecification(dto);
		details1.setSpecification(dto1);
		details2.setSpecification(dto2);
		
		System.out.println(details.getCompany());
		System.out.println(dto.getSpecifictype());
		System.out.println();
		
		MotordetailsDAO dao = new MotordetailsDAO();
		dao.add(details);
		dao.add(details1);
		dao.add(details2);
		dao.printAll();
		System.out.println();
		MotordetailsDTO update = dao.updateWarrentyByCompany("bhorzvan-Motors",(byte)4);
		System.out.println(update.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		MotordetailsDTO update1= dao.updateNoofphaseByCompany("hurst-Motors",(byte)1);
		System.out.println(update1.toString());
		System.out.println();
		dao.printAll();
		System.out.println();
		MotordetailsDTO get = dao.getByCompany("hurst-Motors");
		System.out.println(get);
		System.out.println();
		MotordetailsDTO get1 = dao.getBySpecifictype("permanent-magnetDCmotors");
		System.out.println(get1);
		System.out.println();
		MotordetailsDTO res=dao.deleteByColor("blue");
		System.out.println(res);
		dao.printAll();
		System.out.println();
		MotordetailsDTO res1 =dao.deleteByHorsepower((byte)7);
		System.out.println(res1);
		dao.printAll();
	}

}

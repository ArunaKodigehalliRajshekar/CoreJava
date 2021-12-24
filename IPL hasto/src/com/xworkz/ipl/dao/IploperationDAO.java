package com.xworkz.ipl.dao;

import com.xworkz.ipl.dto.IPLdetailsDTO;

public class IploperationDAO {

	IPLdetailsDTO[]  dao = new IPLdetailsDTO[5];
	int index=0;
	
	public void add(IPLdetailsDTO name) {
		if(index<dao.length) {
			dao[index]=name;
			index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<dao.length;index++) {
			if(dao[index]!=null) {
			System.out.println(dao[index].toString());
		}
		}
	}
	public IPLdetailsDTO updateCoachByTeamname(String teamname,String coach) {
		IPLdetailsDTO detail =null;
		for(int index=0;index<dao.length;index++) {
			if(dao[index]!=null) {
			if(teamname.equals(dao[index].getTeamname())) {
				dao[index].setCoach(coach);
				detail=dao[index];
			}
			}
		}
		return detail;
	}
	public IPLdetailsDTO updateNoofplayersByTeamname(String teamname,byte noofplayers) {
		IPLdetailsDTO detail2 =null;
		for(int index=0;index<dao.length;index++) {
			if(dao[index]!=null) {
			if(teamname.equals(dao[index].getTeamname())) {
				dao[index].setNoofplayers(noofplayers);
				detail2=dao[index];
			}
			}
		}
		return detail2;
	}
	
	public IPLdetailsDTO getByOwner(String owner) {
		for(int index=0;index<dao.length;index++) {
			if(owner.equals(dao[index].getOwner())) {
				return dao[index];
			}
		}
		return null;
	}
	public IPLdetailsDTO getByName(String name) {
		for(int index=0;index<dao.length;index++) {
			if(name.equals(dao[index].getCaptain().getName())) {
				return dao[index];
			}
		}
		return null;
	}
	
	public IPLdetailsDTO deleteByTeamname(String teamname) {
		IPLdetailsDTO detail = null;
		for(int index=0;index<dao.length;index++) {
		if(dao[index]!=null) {
		if(teamname.equals(dao[index].getTeamname())) {
		dao[index]=null;
		detail=dao[index];
		}
		}
		}
	return detail;
	}
	public IPLdetailsDTO deleteByYearOfExperience(byte yearOfExperience) {
		IPLdetailsDTO detail1 = null;
		for(int index=0;index<dao.length;index++) {
		if(dao[index]!=null) {
		if(yearOfExperience==(dao[index].getCaptain().getYearOfExperience())) {
		dao[index]=null;
		detail1=dao[index];
		}
		}
		}
	return detail1;
	}
}

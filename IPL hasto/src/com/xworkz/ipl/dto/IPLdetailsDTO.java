package com.xworkz.ipl.dto;

import java.util.Arrays;

public class IPLdetailsDTO {
	
	String teamname;
	String owner;
	String coach;
	byte noofplayers;
	String jersycolor;
	CaptainDTO captain;
	
	
	
	
	
	public IPLdetailsDTO() {
		
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public byte getNoofplayers() {
		return noofplayers;
	}

	public void setNoofplayers(byte noofplayers) {
		this.noofplayers = noofplayers;
	}

	public String getJersycolor() {
		return jersycolor;
	}

	public void setJersycolor(String jersycolor) {
		this.jersycolor = jersycolor;
	}

	public CaptainDTO getCaptain() {
		return captain;
	}

	public void setCaptain(CaptainDTO captain) {
		this.captain = captain;
	}

	

	public String toString() {
		return "IPLdetailsDTO [teamname=" + teamname + ", owner=" + owner + ", coach=" + coach + ", noofplayers="
				+ noofplayers + ", jersycolor=" + jersycolor + ", captain=" + captain + "]";
	}
	

}

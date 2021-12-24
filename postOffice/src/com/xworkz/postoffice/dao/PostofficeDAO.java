package com.xworkz.postoffice.dao;


import com.xworkz.postoffice.dto.PostofficeDTO;

public class PostofficeDAO {
	
	PostofficeDTO[] office = new PostofficeDTO[4];
	int index=0;
	
	public void add(PostofficeDTO name) {
		if(index<office.length) {
			office[index]=name;
			index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			System.out.println(office[index].toString());
			}
		}
	}
	public PostofficeDTO updatepostMasterBypincode(String postMaster,int pincode) {
		PostofficeDTO postoffice1 =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(pincode==(office[index].getPincode())) {
			office[index].setPostMater(postMaster);
			postoffice1=office[index];
			}
			}
		}
		return postoffice1;
	}
	
	public PostofficeDTO updatenoofworkersBypincode( byte noofworkers,int pincode) {
		PostofficeDTO postoffice =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(pincode==(office[index].getPincode())) {
			office[index].setNoofworkers(noofworkers);
			postoffice=office[index];
			}
			}
		}
		return postoffice;
	}
	
	public PostofficeDTO updatetypistBypincode( String typist,int pincode) {
		PostofficeDTO postoffice2 =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(pincode==(office[index].getPincode())) {
			office[index].setTypist(typist);
			postoffice2=office[index];
			}
			}
		}
		return postoffice2;
	}
	
	
	public PostofficeDTO getByTypist(String typist) {
		
		for(int index=0;index<office.length;index++) {
			if(typist.equals(office[index].getTypist())) {
				return office[index];
			}
		}
	        return null;
	}
public PostofficeDTO getByPincode(int pincode) {
		
		for(int index=0;index<office.length;index++) {
			if(pincode==(office[index].getPincode())) {
				return office[index];
			}
		}
	        return null;
}
public PostofficeDTO getByHobli(String hobli) {
	
	for(int index=0;index<office.length;index++) {
		if(hobli.equals((office[index].getAdress().getHobli()))) {
			return office[index];
		}
	}
        return null;
}
	public PostofficeDTO deleteByTypist(String typist) {
		PostofficeDTO post =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(typist.equals(office[index].getTypist())) {
			office[index]=null;
			post=office[index];
			}
			}
		}
		return post;
	}

	public PostofficeDTO deleteByPincode(int pincode) {
		PostofficeDTO post1 =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(pincode==(office[index].getPincode())) {
			office[index]=null;
			post1=office[index];
			}
			}
		}
		return post1;
	}

	public PostofficeDTO deleteByOfficearea(String officearea) {
		PostofficeDTO post2 =null;
		for(int index=0;index<office.length;index++) {
			if(office[index]!=null) {
			if(officearea.equals((office[index].getAdress().getOfficearea()))) {
			office[index]=null;
			post2=office[index];
			}
			}
		}
		return post2;
	}

}

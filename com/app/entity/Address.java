package com.app.entity;

import java.util.List;

public class Address {
	private int aid;
	private String loc;
	private List<String> city;
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", loc=" + loc + ", city=" + city + "]";
	}


}

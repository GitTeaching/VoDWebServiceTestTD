package org.soa.ws.test2;

public class Realisator {
	
	private String name;
	private String nationality;
	
	public Realisator(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}

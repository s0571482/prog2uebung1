package de.htwberlin.prog2.ws1920;

public class Guest {
	private String name;
	
	private Address privateAdresse;
	private Address businessAdresse;
	
	public void setPrivateAdresse(Address privateAdresse) {
		this.privateAdresse = privateAdresse;
	}

	public void setBusinessAdresse(Address businessAdresse) {
		this.businessAdresse = businessAdresse;
	}
	
	public Guest(String name) {
		this.name = name;
	}
	
}

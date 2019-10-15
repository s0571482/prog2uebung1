package de.htwberlin.prog2.ws1920;

	public class Address {
		private String 	strassenname;
		private int 	hausnummer;
		private String 	ort;
		private String postleitzahl;
		
		public String getPostleitzahl() {
			return postleitzahl;
		}
		public void setPostleitzahl(String postleitzahl) {
			this.postleitzahl = postleitzahl;
		}
		public String getStrassenname() {
			return strassenname;
		}
		public void setStrassenname(String strassenname) {
			this.strassenname = strassenname;
		}
		public int getHausnummer() {
			return hausnummer;
		}
		public void setHausnummer(int hausnummer) {
			this.hausnummer = hausnummer;
		}
		public String getOrt() {
			return ort;
		}
		public void setOrt(String ort) {
			this.ort = ort;
		}
		
		public Address(String strassenname, int hausnummer, String ort, String postleitzahl) {
			super();
			this.postleitzahl=postleitzahl;
			this.strassenname=strassenname;
			this.hausnummer=hausnummer;
			this.ort=ort;
			}
		
		public String toString() {
			return "Address [strassenname=" + strassenname + ", hausnummer=" + hausnummer + ", ort=" + ort
					+ ", postleitzahl=" + postleitzahl + "]";
		}
		
	}


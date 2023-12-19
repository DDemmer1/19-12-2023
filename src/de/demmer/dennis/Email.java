package de.demmer.dennis;

public class Email {
	
	//Attribut, Feld/field , (Eigenschaften)
	
	String text;
	String absender;
	String empfänger;
	String betreff;
	
	//Konstruktor
	
	public Email(String betreff, String neuerEmpfänger) {
		this.betreff = betreff;
		empfänger = neuerEmpfänger;
	}
	
	public Email(int i, String s) {
		System.out.println("String + int");
	}
	
	
	
	public Email() {
		
	}
	
	
	

	
	//Methoden
	
	void printInfo() {
	
	}
	

}

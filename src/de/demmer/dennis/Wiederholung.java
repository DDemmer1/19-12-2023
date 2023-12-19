package de.demmer.dennis;

public class Wiederholung {
	
	public static void main(String[] args) {
		
		// User input
		String userText = "Hallo Welt";
		String userAbsender = "Dennis.Demmer@uni-koeln.de";
		String userEmpfänger ="Nils.Reiter@uni-koeln.de";
		String userBetreff = "Java Objektorientierung";
		//-----------------------------------------------
		
		String meinString;
		Email  meineEmail = new Email("Hallo 1");
		
		Email  meineEmail2 = new Email("Hallo 2");
		
		System.out.println(meineEmail.betreff);
		System.out.println(meineEmail2.betreff);
		
	}
	

}

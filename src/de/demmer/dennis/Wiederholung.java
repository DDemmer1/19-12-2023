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
		Email  meineEmail = new Email(userBetreff, userEmpfänger);
		Email  meineEmail2 = new Email("Hallo 2", "empfänger@empf.de");
	
		meineEmail.text = "Hallo Welt, das ist ein Text";
		
		System.out.println(meineEmail.text);
		
		
		System.out.println(meineEmail.betreff);
		System.out.println(meineEmail2.betreff);
		
	}
	

}

package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	String afficherType() {
		return "Credit";
	}

}

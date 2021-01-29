package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOperation;
	private int montantOperation;
	
	public Operation(String dateOperation, int montantOperation) {
		this.setDateOperation(dateOperation);
		this.setMontantOperation(montantOperation);
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	abstract String afficherType();
		
}

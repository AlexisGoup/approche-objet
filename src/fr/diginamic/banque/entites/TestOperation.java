package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Credit credit_1 = new Credit("24/12/96", 2000);
		Credit credit_2 = new Credit("02/06/06", 15000);
		
		Debit debit_1 = new Debit("15/08/07", 25000);
		Debit debit_2 = new Debit("25/12/96", 125556);

		Operation[] tab = new Operation[] {credit_1, credit_2, debit_1, debit_2};
		
		for (int i = 0; i < tab.length; i++) {
			String sign;
			
			if (tab[i].afficherType() == "Debit") sign = "-"; else sign = "+";
			
			System.out.println("Date de l'opération : " + tab[i].getDateOperation());
			System.out.println("Montant de l'operation : " + sign + tab[i].getMontantOperation());
			System.out.println("Type de l'opération : " + tab[i].afficherType() + "\n");
		}
	}

}

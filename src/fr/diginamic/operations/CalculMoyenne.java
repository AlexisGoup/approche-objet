package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] tabDouble;
	
	public double[] getTabDouble() {
		return tabDouble;
	}

	public void setTabDouble(double[] tabDouble) {
		this.tabDouble = tabDouble;
	}

	public void ajout(double num) {
		double[] newTab = new double[this.tabDouble.length + 1];
		
		for(int i = 0; i < newTab.length; i++) {
			if (i == (newTab.length - 1)) newTab[i] = num;
			else newTab[i] = this.tabDouble[i];
		}
		
		this.tabDouble = newTab;
	}
	
	public double calcul() {
		double moyenne = 0;
		double compteur = 0;
		
		for (int i = 0; i < tabDouble.length; i++) {
			moyenne += tabDouble[i];
			compteur++;
		}
		
		return (moyenne / compteur);
	}

}

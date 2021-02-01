package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private double nbJoursTravailles;
	private double mntRemuneration;
	
	public Pigiste(String nom, String prenom, double nbJoursTravailles, double mntRemuneration) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.mntRemuneration = mntRemuneration;
	}

	@Override
	public double getSalaire() {
		return nbJoursTravailles * mntRemuneration;
	}
}

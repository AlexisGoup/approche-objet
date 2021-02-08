package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		
		Ville other = (Ville) object;
		return this.nom.equals(other.getNom());
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public int compareTo(Ville autre) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(autre.getNom());
	}
	
}

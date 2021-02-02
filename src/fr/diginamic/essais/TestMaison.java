package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBains;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {

		Wc wc = new Wc(5, 0);
		Wc wc2 = new Wc(7, 1);
		
		Salon salon = new Salon(20, 0);
		
		Cuisine cuisine = new Cuisine(20, 0);
		
		SalleDeBains salleDeBains = new SalleDeBains(25, 1);
		
		Chambre chambre = new Chambre(20, 1);
		Chambre chambre2 = new Chambre(20, 1);
		
		Maison maison = new Maison();
		maison.ajouterPiece(wc);
		maison.ajouterPiece(wc2);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salleDeBains);
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(null);
		
		System.out.println("La superficie totale est de : " + maison.superficieTotale());
		System.out.println("La superficie totale de l'étage 0 est de : " + maison.superficieEtage(0));
		System.out.println("La superficie totale de l'étage 1 est de : " + maison.superficieEtage(1));

	}

}

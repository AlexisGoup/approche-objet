package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {	
	
	public static void afficher(Forme forme) {
		System.out.println("Le perimètre est de :" + forme.calculerPerimetre());
		System.out.println("La surface est de : " + forme.calculerSurface());
	}

}

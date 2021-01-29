package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(6);
		Cercle c2 = new Cercle(12);
		
		System.out.println(c1.getPerimetre()); 
		System.out.println(c2.getSurface()); 
	}

}

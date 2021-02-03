package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(12);

		System.out.println("Liste : " + list);
		
		int highest = -2147483648;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > highest) highest = list.get(i);
		}
		
		System.out.println( "Le chiffre le plus élevé de la liste est : " + highest);
		
		int mini = 2147483647;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < mini) mini = list.get(i);
		}
		
		System.out.println("Le chiffre le plus petit de la liste est : " + mini);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == mini) list.remove(i);
		}
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			int isNegative = Integer.toString(list.get(i)).indexOf("-");
			
			if (isNegative != -1) {
				list.set(i, Integer.parseInt(Integer.toString(list.get(i)).replace("-", "")));
			}
		}
		
		System.out.println(list);

	}

}

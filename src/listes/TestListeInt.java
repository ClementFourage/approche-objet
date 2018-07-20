package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> maListe = new ArrayList<Integer>();
			int ani1 = -1;
			//On peut aussi éviter de passer par une variable intermédiaire maListe.add(-1);
			maListe.add(ani1); 
			int ani2 = 5;
			maListe.add(ani2);
			int ani3 = 7;
			maListe.add(ani3);
			int ani4 = 3;
			maListe.add(ani4);
			int ani5 = -2;
			maListe.add(ani5);
			int ani6 = 4;
			maListe.add(ani6);
			int ani7 = 8;
			maListe.add(ani7);
			int ani8 = 5;
			maListe.add(ani8);

		//Affichez tous les éléments de la liste
		for(int i = 0; i < maListe.size(); i++) {
			System.out.println(maListe.get(i));
		}

		//Afficher le plus petit/grand élément de la liste
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i= 0; i < maListe.size(); i++) {
			if (maListe.get(i) < min) {
				min = maListe.get(i);
			}
			if (maListe.get(i) > max) {
				max = maListe.get(i);
			}
			System.out.println("Max = "+max);
			System.out.println("Min = "+min);

		}
	}
}
package listes;

import java.util.ArrayList;
import java.util.List;
import listes.Ville;

public class TestVille {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<Ville> ();


		Ville v1 = new Ville("Nice", 343000);
		villes.add(v1);
		Ville v2 = new Ville("Carcassonne", 47800);
		villes.add(v2);
		Ville v3 = new Ville("Narbonne", 53400);
		villes.add(v3);
		Ville v4 = new Ville("Lyon", 484000);
		villes.add(v4);
		Ville v5 = new Ville("Foix", 9700);
		villes.add(v5);
		Ville v6 = new Ville("Pau", 77200);
		villes.add(v6);
		Ville v7 = new Ville("Marseille", 850700);
		villes.add(v7);
		Ville v8 = new Ville("Tarbes", 40600);
		villes.add(v8);


		for(int i = 0; i < villes.size(); i++) {
			System.out.println(villes.get(i));
		}


		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i= 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);

			if (ville.getHab() < min) {
				min = ville.getHab();
			}
			if (ville.getHab() > max) {
				max = ville.getHab();
			}
			System.out.println("Max = "+max);
			System.out.println("Min = "+min);

		}

		for (int i = 0; i < villes.size(); i++) {
			Ville ville =  villes.get(i);
			if (ville.getHab() > 100000){
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		System.out.println(villes);

	}

}

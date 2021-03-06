package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> maListe2 = new ArrayList<>();

		maListe2.add("Nice");
		maListe2.add("Carcassonne");
		maListe2.add("Narbonne");
		maListe2.add("Lyon");
		maListe2.add("Foix");
		maListe2.add("Pau");
		maListe2.add("Marseille");
		maListe2.add("Tarbes");

		// Afficher tous les �lements de la liste
		System.out.println(maListe2);

		// Rechercher la ville dans cette liste qui a le plus grand nombre de
		// lettres
		int maxVal = Integer.MIN_VALUE; // Faire partir de la plus petite valeur
		String maxVille = null;
		for (int i = 0; i < maListe2.size(); i++) {
			String ville = maListe2.get(i);
			int nbLettres = ville.length();

			if (nbLettres > maxVal) {
				maxVal = nbLettres;
				maxVille = ville;
			}
		}
		System.out.println(maxVille);
		
		
		//Modifiez le contenu de la liste de mani�re � mettre tous les noms de villes en majuscules
		for(int i = 0; i < maListe2.size(); i++) {
			maListe2.set(i, maListe2.get(i).toUpperCase());
			System.out.println(maListe2.get(i));
			
		}
		
	}

}
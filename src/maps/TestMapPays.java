package maps;

import java.util.HashMap;
import java.util.Scanner;
import maps.Pays;

public class TestMapPays {
	
	public static void main(String[] args) {
		
		HashMap<String, Pays> pays = new HashMap<String, Pays>();
		
		pays.put("USA", new Pays("USA", 324_811_000, 55_805.204));
		pays.put("FRA", new Pays("France", 67_795_000, 41_180.697));
		pays.put("ALL", new Pays("Allemagne", 82_800_000, 45_888.423));
		pays.put("UK", new Pays("UK", 65_648_100, 41_158.909));
		pays.put("ITA", new Pays("Italie", 60_589_445, 35_708));
		pays.put("JAP", new Pays("Japon", 126_451_398, 41_300));
		pays.put("CHI", new Pays("Chine", 1_415_140_963, 14_107.431));
		pays.put("RUS", new Pays("Russie", 146_880_400, 24_026));
		pays.put("IND", new Pays("Inde", 1_281_935_911, 5_855.306));
		
		//Initialisation scanner + variable
		Scanner scan = new Scanner(System.in);
		String choix = null;
		
		
		System.out.println("Veuillez entrer le nom d'un pays :");
		choix = scan.next();
		
		//Calcul du PIB global du pays
		
		for (Pays p : pays.values()) {
			double calculPIB = p.getPib()*p.getHabitants();
			p.setCalculPIB(calculPIB);
			
		}
		
		//Affichage du pays et de ses informations
		
		if(pays.containsKey(choix)) {
			System.out.println("Nom du pays : "+pays.get(choix).getNom());
			System.out.println("Nombre d’habitants : "+pays.get(choix).getHabitants());
			System.out.println("PIB : "+pays.get(choix).getPib()+ " $ par habitants");
			System.out.println("PIB total : "+pays.get(choix).getCalculPIB()+ " $");
		}
			else if (!pays.containsKey(choix)) {
				System.out.println("Ce pays n'existe pas, entrez un nouveau code pays :");
		}
		
		scan.close();
	}

}

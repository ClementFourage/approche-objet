package essais;

import entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale();
		a.numeroRue = 20;
		a.libelleRue = "rue de Brest";
		a.codePostal = 35000;
		a.ville = "Rennes";
		
		AdressePostale b = new AdressePostale();
		b.numeroRue = 12;
		b.libelleRue = "rue Walt Disney";
		b.codePostal = 44800;
		b.ville = "Saint-Herblain";
		
	}

}

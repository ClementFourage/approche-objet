package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p = new Personne("Fourage", "Clément", new AdressePostale(20, "rue de Brest", 35000, "Rennes"));
		Personne q = new Personne("Hubier", "Carole", new AdressePostale(12, "rue Walt Disney", 44800, "Saint-Herblain"));

	}

}

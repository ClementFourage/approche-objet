package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p = new Personne();
		p.nomPersonne = "Fourage";
		p.prenomPersonne = "Clément";
		
		p.adresse = new AdressePostale();
		p.adresse.numeroRue = 20;
		p.adresse.libelleRue = "rue de Brest";
		p.adresse.codePostal = 35000;
		p.adresse.ville = "Rennes";
		
		Personne q = new Personne();
		q.nomPersonne = "Hubier";
		q.prenomPersonne = "Carole";
		
		q.adresse = new AdressePostale();
		q.adresse.numeroRue = 12;
		q.adresse.libelleRue = "rue Walt Disney";
		q.adresse.codePostal = 44800;
		q.adresse.ville = "Saint-Herblain";
	}

}

package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p = new Personne("Fourage", "Clément", new AdressePostale(20, "rue de Brest", 35000, "Rennes"));
		AdressePostale adresseV = new AdressePostale(15, "rue de Brest", 35000, "Rennes");
		p.setNom("Durand");
		p.setPrenom("Vicent");
		p.setAdressePostale(adresseV);
		
		String identite = p.getIdentite();
		String nom = p.getNom();
		String prenom = p.getPrenom();
		AdressePostale adresse = p.getAdressePostale();
		
		System.out.println(identite);
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(adresse);
	}

}

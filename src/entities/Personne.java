package entities;

public class Personne {

	public String nomPersonne;
	public String prenomPersonne;
	public AdressePostale adresse;
	
	public Personne(String nvNomPersonne, String nvPrenomPersonne, AdressePostale nvAdresse) {
		nomPersonne = nvNomPersonne;
		prenomPersonne = nvPrenomPersonne;
		adresse = nvAdresse;
		
	}
}

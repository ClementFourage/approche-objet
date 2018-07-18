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
	
	public String getIdentite() {
		return prenomPersonne + " "+nomPersonne.toUpperCase();
	}
	
	public String getNom() {
		return nomPersonne;
	}
	
	public String getPrenom() {
		return prenomPersonne;
		
	}
	
	public AdressePostale getAdressePostale() {
		return adresse;
	}
	
	public void setNom(String nvNomPersonne) {
		nomPersonne = nvNomPersonne;
	}
	
	public void setPrenom(String nvPrenomPersonne) {
		prenomPersonne = nvPrenomPersonne;
	}
	
	public void setAdressePostale(AdressePostale nvAdresse) {
		adresse = nvAdresse;
	}
}


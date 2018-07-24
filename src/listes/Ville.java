package listes;

public class Ville {
	
	private String nom;
	private int hab;
	
	
	public Ville(String nvNom, int nvHab) {
		nom = nvNom;
		hab = nvHab;	
	
		
		
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getHab() {
		return hab;
	}


	public void setHab(int hab) {
		this.hab = hab;
	}


	@Override
	public String toString() {
		return "Ville [nom = " + nom + ", hab = " + hab + "]";
	}
}

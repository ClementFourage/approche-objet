package sets;

public class Pays {
	
	private String nom;
	private int habitants;
	private double pib;
	
	public Pays(String nvNom, int nvHabitants, double nvPIB) {
		nom = nvNom;
		habitants = nvHabitants;
		pib = nvPIB;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}

	@Override
	public String toString() {
		return "Pays [nom = " + nom + ", habitants = " + habitants + ", pib = " + pib + "]";
	}

}
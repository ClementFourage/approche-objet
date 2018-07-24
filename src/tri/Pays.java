package tri;

//implémentation de l'interface Comparable
public class Pays implements Comparable<Pays> {

	private String nom;
	private int habitants;
	private double pib;
	private double calculPIB;
	
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

	public double getCalculPIB() {
		return calculPIB;
	}

	public void setCalculPIB(double calculPIB) {
		this.calculPIB = calculPIB;
	}

	@Override
	public String toString() {
		return "Pays [nom = " + nom + ", habitants = " + habitants + ", pib = " + pib + "]";
	}

	//Methode pour trier le nombre d'habitant
	//@Override
	//public int compareTo(Pays autre) {
		
		//if(habitants > autre.getHabitants()){
			//return 1;
		//}
		//else if(habitants < autre.getHabitants()){
			//return -1;
		//}
		//return 0;
	//}
	
	
	//Methode pour trier les noms par ordre alphabétique
	public int compareTo(Pays autre) {
		return nom.compareTo(autre.getNom());
	}

}

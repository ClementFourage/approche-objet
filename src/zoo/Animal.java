package zoo;

public abstract class Animal {

	//Attributs
	private String nom;
	private String type;
	private String regimesAlimentaires;
	

	//Constructeur
	public Animal(String nvNom, String nvType, String nvRegimesAlimentaires){
		super();
		this.nom = nvNom;
		this.type = nvType;
		this.regimesAlimentaires = nvRegimesAlimentaires;
	}

	public abstract String getFamille();
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegimesAlimentaires() {
		return regimesAlimentaires;
	}

	public void setRegimesAlimentaires(String regimesAlimentaires) {
		this.regimesAlimentaires = regimesAlimentaires;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + "]";
	}
	
	
}


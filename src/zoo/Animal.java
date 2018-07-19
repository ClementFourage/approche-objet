package zoo;

public class Animal {

	//Attributs
	private String nom;
	private String type;

	//Constructeur
	public Animal(String nvNom, String nvType){
		super();
		this.nom = nvNom;
		this.type = nvType;
	}

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

}


package zoo;

public class Poissons extends Animal {

	public Poissons(String nom, String type, String regimesAlimentaires) {
		super(nom, type, regimesAlimentaires);
	}

	public String getFamille() {
		return "POISSONS";
	}
}

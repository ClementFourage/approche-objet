package zoo;

public class Reptiles extends Animal {
	
	public Reptiles(String nom, String type, String regimesAlimentaires) {
		super(nom, type, regimesAlimentaires);
	}
	
	public String getFamille() {
		return "REPTILES";
	}

}

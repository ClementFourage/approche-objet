package zoo;

public class Volatiles extends Animal {
	
	public Volatiles(String nom, String type, String regimesAlimentaires) {
		super(nom, type, regimesAlimentaires);
	}

	@Override
	public String getFamille() {
		return "VOLATILES";
	}

	
}

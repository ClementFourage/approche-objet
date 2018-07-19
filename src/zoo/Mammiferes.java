package zoo;

public class Mammiferes extends Animal {

	public Mammiferes(String nom, String type, String regimesAlimentaires) {
		super(nom, type, regimesAlimentaires);
	}

	@Override
	public String getFamille() {
		return "MAMMIFERES";
	}


}
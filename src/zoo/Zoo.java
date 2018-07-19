package zoo;

public class Zoo {
	
	private String nom;
	private Zone savane;
	private Zone carnivore;
	private Zone aquarium;
	private Zone reptiles;
	private Zone voliere;
	
	public Zoo(String nvnom){
		nom = nvnom;
		savane = new Zone("Savane Africaine");
		carnivore = new Zone("Les Carnivores");
		aquarium = new Zone("Aquarium");
		reptiles = new Zone("Les Reptiles");
		voliere = new Zone("La Volière");
		
	}
	
	public void addAnimal(Animal animal) {
		if (animal.getRegimesAlimentaires().equals("CARNIVORE") && animal.getFamille().equals("MAMMIFERES")){
			carnivore.addAnimal(animal);
		} else if (animal.getRegimesAlimentaires().equals("HERBIVORE") && animal.getFamille().equals("MAMMIFERES")){
			savane.addAnimal(animal);
		} else if(animal.getFamille().equals("POISSONS")){
			aquarium.addAnimal(animal);
		} else if (animal.getFamille().equals("REPTILES")){
			reptiles.addAnimal(animal);
		}
	}
	

	public void afficher() {
		savane.afficher();
		carnivore.afficher();
		aquarium.afficher();
		reptiles.afficher();
		voliere.afficher();
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Zone getSavaneAfricaine() {
		return savane;
	}
	public void setSavaneAfricaine(Zone savaneAfricaine) {
		this.savane = savaneAfricaine;
	}
	public Zone getCarnivore() {
		return carnivore;
	}
	public void setCarnivore(Zone carnivore) {
		this.carnivore = carnivore;
	}
	public Zone getAquarium() {
		return aquarium;
	}
	public void setAquarium(Zone aquarium) {
		this.aquarium = aquarium;
	}
	public Zone getFermeAuxReptiles() {
		return reptiles;
	}
	public void setFermeAuxReptiles(Zone fermeAuxReptiles) {
		this.reptiles = fermeAuxReptiles;
	}
	public Zone getVoliere() {
		return voliere;
	}
	public void setVoliere(Zone voliere) {
		this.voliere = voliere;
	}

}

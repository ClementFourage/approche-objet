package zoo;

public class Zone {

	private String nom;
	private Animal[] animaux;
	private int compteur;

	public Zone(String nvnom){
		nom = nvnom;
		animaux = new Animal[100];	
	}
	
	public void addAnimal(Animal animal){
		for (int i = 0; i < animaux.length; i++){
			if (animaux[i] == null){
				animaux[i] = animal;
				compteur++;
				break;
			}
		}
	}
	
	public void afficher(){
		for (int i=0; i<animaux.length; i++){
			if (animaux[i]!= null){
				System.out.println(animaux[i]);
			}
		}
	}
	
	public int getCompteur() {
		return compteur;
	}
	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Animal[] getAnimaux() {
		return animaux;
	}
	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}



}

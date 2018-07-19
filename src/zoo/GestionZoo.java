package zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo("La Palmyre");
		
		//écriture simple pour ajouter une animal
		
		Animal an1 = new Animal("Go", "Boa");
		
		Zone reptiles = zoo1.getFermeAuxReptiles();
		reptiles.addAnimal(an1);
		
		
		//écriture utilisée en entreprise
		
		zoo1.getSavaneAfricaine().addAnimal(new Animal("Toto", "Taureau"));
		zoo1.getCarnivore().addAnimal(new Animal("Kiki", "Lion"));
		
		System.out.println(zoo1.getCarnivore().getCompteur());
	}
	
}

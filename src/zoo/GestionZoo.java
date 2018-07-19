package zoo;

public class GestionZoo {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo("La Palmyre");
		
		//écriture simple pour ajouter une animal
		
		//Animal an1 = new Animal("Go", "Boa");
		
		//Zone reptiles = zoo1.getFermeAuxReptiles();
		//reptiles.addAnimal(an1);
		
		
		//écriture utilisée en entreprise
		
		zoo1.addAnimal(new Volatiles("bidule","oiseau","OMNIVORE"));
		zoo1.addAnimal(new Reptiles("truc","croco","CARNIVORE"));
		zoo1.addAnimal(new Poissons("nemo","poisson clown","HERBIVORE"));
		zoo1.addAnimal(new Mammiferes("coco","girafe","HERBIVORE"));
		
		zoo1.afficher();
	}
	
}

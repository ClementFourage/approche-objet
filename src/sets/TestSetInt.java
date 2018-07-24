package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetInt {

	public static void main(String[] args) {

		//instancier un HashSet d’entiers
		Set<Integer> set = new HashSet<>();
		set.add(-1);
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(-2);
		set.add(4);
		set.add(8);
		set.add(5);


		//Affichez tous les éléments de la liste
		System.out.println(set);


		//Recherchez le plus petit élément de la liste

		int min = Integer.MAX_VALUE;

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			int i = (Integer) iterator.next();
			if (i < min) {
				min = i;
			}

		}

		System.out.println(min);


		//Recherchez le plus grand élément de la liste
		int max = Integer.MIN_VALUE;

		Iterator<Integer> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			int i = (Integer) iterator2.next();
			if (i > max) {
				max = i;
			}

		}
		
		System.out.println(max);
		
	}

}

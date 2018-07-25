package utils;

import utils.StringUtils;

public class TestStringUtils {

	public static void main(String[] args) {
		
		
//Exercice 1 -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		StringUtils.asciiArt("Coucou");
		System.out.println();
	
		
//Exercice 2.1 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		StringUtils str = new StringUtils("Yeah", 4);
		str.repeter();
		
		String s = str.repeter(); // pour stocker dans une nouvelle variable le return de la methode repeter
		System.out.println(s);
		
		
//Exercice 2.2 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------
		
		String s1 = StringUtils.transform("Salut");
		
		System.out.println(s1);
		
		
//Exercice 2.3 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------
		
		StringUtils s2 = new StringUtils();
		int x = s2.toInt("5");

		System.out.println(x);
		
		
//Exercice 2.4 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------
		
		StringUtils s3 = new StringUtils();
		String y = s3.toString("Oui");
		
		System.out.println(y);
		
		
		
	}	
	
}

package utils;

public class TestMultiplication {

	public static void main(String[] args) {

		Multiplication multi = new Multiplication(5, 4);
		multi.execute();
		
		int s = multi.execute(); // pour stocker dans une nouvelle variable le return de la methode repeter
		System.out.println(s);
		
	}

}

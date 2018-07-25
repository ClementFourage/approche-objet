package utils;

public class Multiplication {

	private int a;
	private int b;
	
	public Multiplication(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int execute(){
		return a*b;
	}

	@Override
	public String toString() {
		return "Multiplication [a=" + a + ", b=" + b + "]";
	}
	
	
}
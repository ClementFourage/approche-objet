package utils;

public class TestDistance {

	public static void main(String[] args) {

		DistanceCalculator dist = new DistanceCalculator();
		
		Point a = new Point(0, 16);
		Point b = new Point(2, 5);
		Distance d = dist.calculeDistance(a, b);
		
		System.out.println(d.getValue());
	
		
		
	}

}

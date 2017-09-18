package week9;

public class LearningMethodOverloading {

	public static void main(String[] args) {
		System.out.println(incrementBy10(33));
		System.out.println(incrementBy10(99.1));
		System.out.println(incrementBy10(5, 10));
	}
	
	public static int incrementBy10(int value) {
		value = value + 10;
		return value;
	}
	
	public static int incrementBy10(int x, int y) {
		x = x + y;
		x = x + 10;
		return x;
	}
	
	public static double incrementBy10(double value) {
		value = value + 10;
		return value;
	}
	
}

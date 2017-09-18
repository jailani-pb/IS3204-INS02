package week9;

public class LearningPassingArgsByValues {

	static int z = 50;
	
	public static void main(String[] args) {
		int x = incrementBy10(30);
		System.out.println(x);
		int y = 99;
		int incrementY = incrementBy10(y);
		System.out.println("## This is y and incrementY variable");
		System.out.println(incrementY);
		System.out.println(y);
		incrementBy20();
		System.out.println("## This is z variable");
		System.out.println(z);
	}
	
	public static void incrementBy20() {
		z = z + 20;
	}
	
	public static int incrementBy10(int value) {
		value = value + 10;
		return value;
	}
	
}

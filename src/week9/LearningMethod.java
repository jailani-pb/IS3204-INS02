package week9;

public class LearningMethod {

	public static void main(String[] args) {
		System.out.println("Sum from 1 to 10 is " + sumRangeValue(1, 10));
		System.out.println("Sum from 20 to 37 is " + sumRangeValue(20, 37));
		System.out.println("Sum from 35 to 49 is " + sumRangeValue(35, 49));
	}
	
	public static int sumRangeValue(int lowerRange, int upperRange) {
		int sum = 0;
		for(int i = lowerRange; i <= upperRange; i++) {
			sum += i;
		}
		return sum;
	}
	
}



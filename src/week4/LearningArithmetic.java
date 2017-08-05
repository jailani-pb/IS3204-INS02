package week4;

public class LearningArithmetic {

	public static void main(String[] args) {
		// Unary
		System.out.println(+5);
		System.out.println(-2);
		// Addition
		System.out.println(5 + 2);
		// Substraction
		System.out.println(5 - 2);
		// Division
		// Int data type, it will print 2
		System.out.println(5 / 2);
		// Typecasted to double, it will print 2.5
		System.out.println((double) 5 / (double) 2);
		// Multiplication
		System.out.println(5 * 2);
		// Modulus
		System.out.println(5 % 2);
		System.out.println(4 % 2);
		// Example of modulus usage
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i + " is an odd number.");
			} else {
				System.out.println(i + " is an even number.");
			}
		}
		// Combining the arithmetic operators (BODMAS)
		System.out.println(3 + 4 * 4 + 5 * (4 + 3) - 1);
		
		// Exponent Operator
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(9, 0.5));
		// Square root
		System.out.println(Math.sqrt(16));
		// Example: Pythagoras Theorem
		int a = 5;
		int b = 6;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
	}
	
}

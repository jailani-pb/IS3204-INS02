package week4;

public class LearningLogicalOperators {

	public static void main(String[] args) {
		// NOT
		System.out.println("True: " + true);
		System.out.println("NOT True: " + !true);
		System.out.println("False: " + false);
		System.out.println("NOT False: " + !false);
		int a = 5;
		int b = 10;
		System.out.println("NOT a < b " + !(a < b));
		// Example of NOT
		while(!(a >= b)) {
			System.out.println("a is still not greater than b.");
			a++;
		}
		System.out.println("a is now greater than or equal to b.");
		System.out.println();
		// AND
		System.out.println("True AND True= " + (true && true));
		System.out.println("True AND False= " + (true && false));
		System.out.println("False AND True= " + (false && true));
		System.out.println("False AND False= " + (false && false));
		int c = 25;
		int d = 20;
		int e = 30;
		System.out.println("c > d AND c < e = " + ((c > d) && (c < e)));
		// Example of AND
		if((c > d) && (c < e)) {
			System.out.println("Value of c is between d, e");
		} else {
			System.out.println("Value of c is not between d, e");
		}
		System.out.println();
		// OR
		System.out.println("True OR True= " + (true || true));
		System.out.println("True OR False= " + (true || false));
		System.out.println("False OR True= " + (false || true));
		System.out.println("False OR False= " + (false || false));
		int f = 50;
		int g = 10;
		int h = 30;
		System.out.println("f < g OR g > h = " + ((f < g) || (g > h)));
		// Example of OR
		if((f < g) || (g > h)) {
			System.out.println("At least one of them is true.");
		} else {
			System.out.println("Both of them are false");
		}
		System.out.println();
		// Combining multiple logical operators
		System.out.println("((f < g) || (g > h)) && ((c > d) && (c < e))");
		System.out.println(((f < g) || (g > h)) && ((c > d) && (c < e)));
		System.out.println("!((g > c) && ((f < g) || (g > h)))");
		System.out.println(!((g > c) && ((f < g) || (g > h))));
	}
	
}




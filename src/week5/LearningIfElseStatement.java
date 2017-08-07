package week5;

public class LearningIfElseStatement {

	public static void main(String[] args) {
		// Common mistakes made when implementing if statements.
		// You should not put a semi-colon after the if statement condition.
		if(false); {
			System.out.println("This is false");
		}
		
		// If - Else
//		if(false) {
//			System.out.println("This is true.");
//		} else {
//			System.out.println("This is false");
//		}
		
		int a = 5;
		int b = 10;
		int c = 15;
		if((a >= b) && (a <= c)) {
			System.out.println("a is between b and c");
		} else {
			System.out.println("a is not between b and c");
		}
	}
	
}

package week3;

public class LearningIncrementDecrement {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(x);
		// increment
		x = x + 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		// decrement
		x = x - 1;
		System.out.println(x);
		x--;
		System.out.println(x);
		// Example of increment/decrement usage
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		// Pre-increment
		int y = 5;
		System.out.println(++y);
		System.out.println(y);
		// Post-increment
		int z = 5;
		System.out.println(z++);
		System.out.println(z);
		
		// Pre-decrement
		int a = 5;
		System.out.println(--a);
		System.out.println(a);
		// Post-decrement
		int b = 5;
		System.out.println(b--);
		System.out.println(b);
	}
	
}






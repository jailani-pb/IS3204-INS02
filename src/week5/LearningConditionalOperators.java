package week5;

import java.util.Scanner;

public class LearningConditionalOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int powerValue = scanner.nextInt();
		
		if((powerValue >= 1) && (powerValue <= 10)) {
			System.out.println(Math.pow(5, powerValue));
		} else {
			System.out.println("Invalid power value allowed.");
		}
		
		System.out.println(
				((powerValue >= 1) && (powerValue <= 10)) ?
						Math.pow(5, powerValue) : "Invalid power value allowed."
				);
		
		String output = ((powerValue >= 1) && (powerValue <= 10)) ?
				Double.toString(Math.pow(5, powerValue)) : "Invalid power value allowed.";
		System.out.println(output);
	}
	
}



package week5;

import java.util.Scanner;

public class LearningNestedIfStatements {

	public static void main(String[] args) {
//		if(true) {
//			System.out.println("This is true");
//			if(true) {
//				System.out.println("This is true as well");
//			} else {
//				System.out.println("This is false.");
//			}
//		} else {
//			System.out.println("This is false");
//		}
		
//		int a = 150;
//		int b = 70;
//		int c = 80;
//		if((a >= b) && (a <= c)) {
//			System.out.println("a is between b and c");
//		} else {
//			if(a < b) {
//				System.out.println("a is less than b");
//			} else {
//				if(a > c) {
//					System.out.println("a is more than c");
//				}
//			}
//		}
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Input value you want to check (a) :");
//		int a = scanner.nextInt();
//		System.out.println("Input lower range value (b) :");
//		int b = scanner.nextInt();
//		System.out.println("Input upper range value (c) :");
//		int c = scanner.nextInt();
//		if((a >= b) && (a <= c)) {
//			System.out.println("a is between b and c");
//		} else {
//			if(a < b) {
//				System.out.println("a is less than b");
//			} else {
//				if(a > c) {
//					System.out.println("a is more than c");
//				}
//			}
//		}
		
		// Exercise: Create an implementation to check if the number
		// user input is divisible by 3 or not.
		// Hint: Number divisible by 3 should produce remainder 0
		// when divided by 3.
//		System.out.println("Input value to check if divisible by 3: ");
//		int userInput = scanner.nextInt();
//		if((userInput % 3) == 0) {
//			System.out.println(userInput + " is divisible by 3.");
//		} else {
//			System.out.println(userInput + " is not divisible by 3,"
//					+ " the remainder is " + (userInput % 3));
//		}
		
		System.out.println("Main Menu (choose option number):");
		System.out.println("(1) List down School in PB");
		int selectedOption = scanner.nextInt();
		if(selectedOption == 1) {
			System.out.println("The following are the List of Schools");
			System.out.println("Choose an option to view list of lecturers:");
			System.out.println("(1) School of ICT");
			System.out.println("(2) School of Business");
			selectedOption = scanner.nextInt();
			if(selectedOption == 1) {
				System.out.println("Lecturers in SICT");
				System.out.println("-\tJailani");
				System.out.println("-\tBahit");
				System.out.println("-\tAziz");
			} else {
				if(selectedOption == 2) {
					System.out.println("Lecturers in SBS");
					System.out.println("-\tKhairul");
				} else {
					System.out.println("Invalid option.");
				}
			}
		} else {
			System.out.println("Invalid option.");
		}
	}
	
}

package week4;

import java.util.Scanner;

public class LearningInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please input a message: ");
//		String message = scanner.nextLine();
//		System.out.println("You have typed: " + message);
//		message = scanner.nextLine();
//		System.out.println("You have typed: " + message);
		
//		System.out.println("Please input a message: ");
//		String message = scanner.next();
//		System.out.println("You have typed: " + message);
//		message = scanner.next();
//		System.out.println("You have typed: " + message);
		
		System.out.println("Welcome to our simple addition calculator.");
		System.out.println("Please input two whole number to be added.");
		System.out.println("Please input the first value: ");
		int a = scanner.nextInt();
		System.out.println("Please input the second value: ");
		int b = scanner.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b));
		
	}
	
}

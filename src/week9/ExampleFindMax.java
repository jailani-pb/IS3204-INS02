package week9;

import java.util.Scanner;

public class ExampleFindMax {

	static Scanner scanner = new Scanner(System.in);
	static int x;
	static int y;
	
	public static void main(String[] args) {
		askUserInput();
		System.out.println(findAndShowHighest(x, y));
		askUserInput();
		System.out.println(findAndShowHighest(x, y));
		
		scanner.close();
	}
	
	public static String findAndShowHighest(int firstNumber, int secondNumber) {
		int result = findHighest(firstNumber, secondNumber);
		return "The highest number of " + 
			firstNumber + " and " + secondNumber + " is " + result;
	}
	
	public static int findHighest(int firstNumber, int secondNumber) {
		int result;
		if(firstNumber > secondNumber) {
			result = firstNumber;
		} else {
			if(firstNumber == secondNumber) {
				result = secondNumber;
			} else {
				result = secondNumber;
			}
		}
		return result;
	}
	
//	public static int findHighest() {
//		int result;
//		if(x > y) {
//			result = x;
//		} else {
//			if(x == y) {
//				result = y;
//			} else {
//				result = y;
//			}
//		}
//		return result;
//	}
	
	public static void askUserInput() {
		System.out.println("Input two numbers to find which is higher:");
		System.out.println("First Number:");
		x = scanner.nextInt();
		System.out.println("Second Number:");
		y = scanner.nextInt();
	}
	
}

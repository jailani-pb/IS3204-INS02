package week7;

import java.util.Scanner;

public class ExampleArray2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("State number of student name you want to fill in");
		String userInput = scanner.nextLine();
		try {
			int convertUserInput = Integer.parseInt(userInput);
			String[] names = new String[convertUserInput];
			String[] icnumber = new String[convertUserInput];
			// To fill in data to the array
			for(int i = 0; i < names.length; i++) {
				System.out.println("Please input name for student " + i + ":");
				names[i] = scanner.nextLine();
				System.out.println("Input ic number:");
				icnumber[i] = scanner.nextLine();
			}
			// Retrieve all data (elements) from array.
			System.out.println("The following are all of the students name:");
			// If retrieving all elements from array, you can use for-each loop
			for(String name : names) {
				System.out.println(name);
			}
			// If retrieving all elements from 2 array at same time
			// Use normal for loop.
			System.out.println("Name (ICNUMBER)");
			for(int i = 0; i < names.length; i++) {
				System.out.println(names[i] + " (" + icnumber[i] + ")");
			}
		} catch(NumberFormatException e) {
			System.out.println("Invalid input.");
		}
		
		scanner.close();
	}
	
}

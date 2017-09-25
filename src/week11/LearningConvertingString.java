package week11;

import java.util.Scanner;

public class LearningConvertingString {

	public static void main(String[] args) {
		String text = "Programming Application";
		// Convert text to all uppercase
		String textUpperCase = text.toUpperCase();
		System.out.println(textUpperCase);
		System.out.println(text);
		// Convert text to all lowercase
		String textLowerCase = text.toLowerCase();
		System.out.println(textLowerCase);
		
		// Removing trailing spaces at beginning and end of string
		String text2 = "    A A A    ";
		System.out.println(text2);
		System.out.println(text2.trim());
		
		
		// Exercise:
		// Implement scanner to ask for user input.
		// Convert the user input to lower case.
		// Remove any trailing spaces.
		// Print the output of the converted user input.
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String convertedUserInput = userInput.toLowerCase().trim();
		System.out.println(convertedUserInput);
		scanner.close();
	}
	
}





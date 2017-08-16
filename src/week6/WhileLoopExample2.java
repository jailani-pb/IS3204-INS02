package week6;

import java.util.Scanner;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		boolean stillCalculating = true;
		String userInput = "";
		while(stillCalculating) {
			System.out.println("Current Total: " + total);
			System.out.println("Input value to calculate (type quit to stop):");
			userInput = scanner.nextLine();
			if(userInput.toLowerCase().equals("quit")) {
				System.out.println("Application has been terminated.");
				System.out.println("Final Total: " + total);
				stillCalculating = false;
			} else {
				try {
					int convertUserInput = Integer.parseInt(userInput);
					// total = total + convertUserInput
					total += convertUserInput;
				} catch (NumberFormatException e) {
					System.out.println("Invalid input, total is not calculated.");
				}
			}
		}
		
		scanner.close();
	}
	
}






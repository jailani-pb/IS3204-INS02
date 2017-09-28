package week11;

import java.util.Scanner;

public class ExampleAccountManagement {

	// Exercise: Edit this class
	// 1) Implement usernames array with size 5 to store user's
	//		username taken from email address.
	//		Eg. abc@gmail.com, the username will be abc.
	// 2) Check for invalid email. Eg. a@abc@gmail.com is invalid.
	// 3) Remove any trailing spaces.
	// 4) Remove any spaces in between email address before storing
	//		into emails array.
	// 5) Remove any spaces in between username before storing into
	//		usernames array.
	
	static String[] emails = new String[5];
	static String[] passwords = new String[5];
	static int numberRegistered = 0;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Account Management Menu:");
		System.out.println("(1) Register");
		System.out.println("(2) Login");
		String userInput = scanner.nextLine();
		while(!userInput.equalsIgnoreCase("q")) {
			int optionChosen = Integer.parseInt(userInput);
			
			if(optionChosen == 1) {
				if(numberRegistered >= 4) {
					System.out.println("System full. Cannot register.");
				} else {
					register();
				}
			} else if(optionChosen == 2) {
				login();
			}
			
			System.out.println("Account Management Menu:");
			System.out.println("(1) Register");
			System.out.println("(2) Login");
			userInput = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	public static void register() {
		System.out.println("Register using pb email:");
		String email = "";
		while(true) {
			System.out.println("Email Address:");
			email = scanner.nextLine();
			if(email.toLowerCase().endsWith("@pb.edu.bn")) {
				break;
			} else {
				System.out.println("Must be pb email");
			}
		}
		String password = "";
		while(true) {
			System.out.println("Password:");
			password = scanner.nextLine();
			System.out.println("Confirm Password:");
			String confirmPassword = scanner.nextLine();
			if(password.equals(confirmPassword)) {
				break;
			} else {
				System.out.println("Password and "
						+ "Confirm Password must match.");
			}
		}
		System.out.println("Registration Complete.");
		emails[numberRegistered] = email;
		passwords[numberRegistered] = password;
		numberRegistered++;
	}
	
	public static void login() {
		System.out.println("Login:");
		System.out.println("Email Address:");
		String email = scanner.nextLine();
		System.out.println("Password:");
		String password = scanner.nextLine();
		for(int i = 0; i < 5; i++) {
			if(email.equalsIgnoreCase(emails[i])
					&& password.equals(passwords[i])) {
				System.out.println("You are logged in.");
				break;
			} else {
				System.out.println("Invalid email and password.");
				break;
			}
		}
	}
}






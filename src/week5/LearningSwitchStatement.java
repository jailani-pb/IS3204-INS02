package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningSwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dayNumber = scanner.nextInt();
		if(dayNumber == 1) {
			System.out.println("Monday");
		} else if(dayNumber == 2) {
			System.out.println("Tuesday");
		} else if(dayNumber == 3) {
			System.out.println("Wednesday");
		} else if(dayNumber == 4) {
			System.out.println("Thursday");
		} else if(dayNumber == 5) {
			System.out.println("Friday");
		} else if(dayNumber == 6) {
			System.out.println("Saturday");
		} else if(dayNumber == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid day number.");
		}
		
		
		switch(dayNumber) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Invalid day number."); break;
		}

		//Exercise 1
		try {
			int monthNumber = scanner.nextInt();
			switch(monthNumber) {
				case 1: System.out.println("January"); break;
				case 2: System.out.println("February"); break;
				case 3: System.out.println("March"); break;
				case 4: System.out.println("April"); break;
				case 5: System.out.println("May"); break;
				case 6: System.out.println("June"); break;
				case 7: System.out.println("July"); break;
				case 8: System.out.println("August"); break;
				case 9: System.out.println("September"); break;
				case 10: System.out.println("October"); break;
				case 11: System.out.println("November"); break;
				case 12: System.out.println("December"); break;
				default: System.out.println("Invalid month number."); break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid month number.");
		}
		
		//Exercise 2
		try {
			int powerValue = scanner.nextInt();
			// This implementation is actually not efficient.
//			switch(powerValue) {
//				case 1: System.out.println(Math.pow(5, 1)); break;
//				case 2: System.out.println(Math.pow(5, 2)); break;
//				case 3: System.out.println(Math.pow(5, 3)); break;
//				case 4: System.out.println(Math.pow(5, 4)); break;
//				case 5: System.out.println(Math.pow(5, 5)); break;
//				case 6: System.out.println(Math.pow(5, 6)); break;
//				case 7: System.out.println(Math.pow(5, 7)); break;
//				case 8: System.out.println(Math.pow(5, 8)); break;
//				case 9: System.out.println(Math.pow(5, 9)); break;
//				case 10: System.out.println(Math.pow(5, 10)); break;
//				default: System.out.println("Invalid power value allowed."); break;
//			}
			
			// Alternatively, it is better to use if statement as shown here
			if((powerValue >= 1) && (powerValue <= 10)) {
				System.out.println(Math.pow(5, powerValue));
			} else {
				System.out.println("Invalid power value allowed.");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid power value allowed.");
		}
	}

}








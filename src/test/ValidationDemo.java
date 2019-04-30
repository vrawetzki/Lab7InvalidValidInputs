package test;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//checkForInt(scan);
		checkForInt2(scan);

	}
	// while loop to keep prompting the user for a whole number
	public static void checkForInt2(Scanner scan2) { // parameter has the same name, so change it to scan2
		System.out.println("Please enter a whole number: ");
		while (!scan2.hasNextInt()) {
			scan2.nextLine();  // garbage line needed to consume the junk that doesn't
								// match what we're expecting
			// to check to see if a user has put in an int vs a number (use !)
			System.out.println("Try again, please enter a whole number!");
		}
		int userNum = scan2.nextInt();
		System.out.println("You entered " + userNum);
	}
	 
	public static void checkForInt(Scanner scan) {
		// static because we're just calling the method
		System.out.println("Please enter a whole number: ");
		// because its a boolean - use that to control logic
		if (scan.hasNext()) { //making sure the scanner has an int,
			int userNum = scan.nextInt();
			System.out.println(userNum);
		} else {
			System.out.println("Your number is not valid");
			
		}
		
		
	}
	

}// to make a string not equal  -- string.equal()!;

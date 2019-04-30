//package test;
//
//import java.util.Scanner;
//
//public class ExceptionEx {
//
//	public static void main(String[] args) {
//		Scanner scnr = new Scanner(System.in);
//		
//		int sum = 0;
//		int x;
//		do {
//			System.out.print("Enter a number to add. 0 to stop: ");
//			String input = scnr.nextLine();
//			
//			try {
//				int y = scnr.nextInt();
//				
//				if (y <= 0) {
//					throw new IllegalArgumentException("Wrong Input!");
//			}
//				
//			// This line may throw an exception. What type of exception?
//			// Add a try/catch to handle the exception, inform the user
//			// that their input is invalid, and continue the loop.
//			// (hint: use `continue` keyword)
//			x = Integer.parseInt(input);
//			
//			sum += x;
//		} 
//		}
//		}finally 
//			
//	{
//		scnr.close();
//	}
//
//	while(x!=0);
//	{
//		System.out.println("The sum is: " + sum);
//	}
//}}
package test;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int sum = 0;
		int x = 0; // there is a chance that this try block won't get executed
					//  therefore x wont have a value to check against
					// primitive types always have to have a value
		do {
			System.out.print("Enter a number to add. 0 to stop: ");
			String input = scnr.nextLine();
			
			// This line may throw an exception. What type of exception?
			// 		number four input exception
			// 		zero is stop condition
			// Add a try/catch to handle the exception, inform the user
			// that their input is invalid, and continue the loop.
			// (hint: use `continue` keyword)
			
			try {
				x = Integer.parseInt(input);
				
				sum += x; // keeps adding to userInput
			} catch (NumberFormatException e) {
				System.out.println("The number was invalid!");
				continue; // the continue means it is going to the top of the loop
			} 
			
			
		} while (x != 0);
	
		System.out.println("The sum is: " + sum);
		
		scnr.close();
	}
	
	
}

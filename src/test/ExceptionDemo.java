package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a whole number: ");
		
		
		try {
			// anything that you think could go wrong
			// should go in the try block
		int userNum = scan.nextInt();
		
		
		if (userNum < 0) {
			// if the above condidtion is true
			// we'll throw the exception below and it goes to the 
			// catch block for this exception
			throw new IllegalArgumentException("Can't be a negative!");
		}
		
		// this will cause an arithmetic exception when a user enters 0
		System.out.println(10 / userNum);
		
		} catch (InputMismatchException e) {
			// this block of code only runs if an input mismatch exception occurs
			System.out.println("Hey, enter in a whole number: ");
			
		} catch (ArithmeticException | IllegalArgumentException e) {
			// you can add an additional exceptions as long as
			// they are higher in the hierachy structure
			System.out.println("Contact someone, you entered 0...");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// catch any and all types of exceptions
			// this should always go last because it's the most generic class
			System.out.println("Contact customer service -- something went terribly wrong");
		} finally {
			// the finally block is optional
			// but if used, will run the code regardless
			// of whether an exception occurs or not
			scan.close();
		}
		
		
		
		
	}
	
	

}

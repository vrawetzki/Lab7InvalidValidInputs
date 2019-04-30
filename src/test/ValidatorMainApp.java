package test;

import java.util.Scanner;

public class ValidatorMainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// we can use any of the validator methods by referencing 
		// the name of the class(validator) and tehn using the . operator
		// these methods can also be assigned to a variable that matches the return type
		//String name = Validator.getString(scan, "Please enter your name: "); // dont use this if you need to consume a whole sentence
		//System.out.println(name);
		
		
		// to get whole number
		// difference between left hand side and right hand side. left is reciving 
		//int userNum = Validator.getInt(scan, "Please enter a whole number: ");
		//System.out.println(userNum);
		
		//  use the getint with range 50-100
		//int userRange = Validator.getInt(scan,  "Please enter a whole number", 50, 100);
		//System.out.println(userRange);
		
		
		//double userDouble = Validator.getDouble(scan, "Please enter a double: ");
		// doubles are more precise than ints
		// can an int be assigned to a double? yes
		// pins that .0 if we assign a whole number
		//System.out.println(userDouble);
		// this method will take the int and add decimal place
		// validates against words like hello or help
		// keep prompting til i enter decimal number -- 78.9
		
		
		
		double userDouble = Validator.getDouble(scan, "Please enter a double between 9.25 and 87.665: ", 9.25, 87.665);
		System.out.println(userDouble);
		
		
		
		scan.close(); // not seeing anything because this is a string method
	}

}

package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7InvalidInputs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = Validator.getString(scan, "Please enter a valid name: ");
		System.out.println(name);
		//System.out.println("Sorry, name is not valid!");

		System.out.println("Please enter a valid email: ");
		
			String email = Validator.getString(scan, "Please enter a valid email: ");
			boolean email2 = Validator.isValid("\\w[A-Za-z0-9]{5,30}+@\\w[A-Za-z0-9]", email);
			System.out.println(email);
			System.out.println("Email is valid!");

			String phoneNum = Validator.getString(scan, "Please enter a valid phone number: ");
			boolean testPhone = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNum);
			System.out.println(phoneNum);
			System.out.println("Sorry, phone is not valid");
		
			String date = Validator.getString(scan, "Please enter a valid date: ");
			boolean isDate1 = Pattern.matches("\\d{2}/\\d{2}/\\d{4}", date);
			System.out.println(isDate1);
			System.out.println("Sorry, date is not valid!");
		
	}
}

package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// need to start with a pattern
		
		// first way to use regex
		//Pattern p = Pattern.compile("abc");
		// use matcher method
		//Matcher m = p.matcher("abcdef");
		// right hand side is method call and is 'p'
		// if we want to find if its true or false
		//boolean test = m.matches();
		//System.out.println(test);
		
		
		// second way to use regex
		//boolean testPhone = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", "313-555-1212");
		//System.out.println(testPhone);
			
		// on your own example:
		// regex pattern for a valid java identifer (names)
		
		boolean testNum = Pattern.matches(^(?![\\d_])(\\w+?)(\\d*)$, $);
		
		
		
				
	}

}

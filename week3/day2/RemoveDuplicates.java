package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str = "PayPal India";
		
		char[] charArray = str.toCharArray();
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for (Character eachChar : charArray) {
			
			ch.add(eachChar);
			
		}
		
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

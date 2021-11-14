package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> values = new ArrayList<String>();
		
		//	datatypeOfSource tempVariable: source	
		for (String eachData : input) {
			values.add(eachData);
		}
		//before sorting
		System.out.println(values);
		
		Collections.sort(values);
		
		//After sorting
		System.out.println(values);
		
		
		
	}

}

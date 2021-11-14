package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * add() -> to add new item into Set
 * size() -> to find the number of items in list
  * remove() -> to remove item from list
 * 
 */

public class LearnSet {

	public static void main(String[] args) {
		Set<String> values = new LinkedHashSet<String>();
		
		System.out.println(values.add("Hari")); //index for the first item 0
		values.add("Aravind");
		values.add("Eswar");
		values.add("Ram");
		values.add("Saheel"); 
		values.add("Babu"); // 5 -> size()-1
		
		System.out.println(values.add("Hari"));
		
		 for (String eachItem : values) { 
			  System.out.println(eachItem);
		  
		  }
		 
		
		//List<String> listValues = new ArrayList<String>(values);
		
		//list.addAll(set)
		//listValues.addAll(values);
		
	//	System.out.println(listValues.get(2));
		
		
		 
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

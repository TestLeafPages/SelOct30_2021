package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * add() -> to add new item into list
 * size() -> to find the number of items in list
 * get(index) -> to get single item from list
 * remove() -> to remove item from list
 * 
 */

public class LearnList {

	public static void main(String[] args) {
		List<String> values = new ArrayList<String>();
		
		values.add("Hari"); //index for the first item 0
		values.add("Aravind");
		values.add("Eswar");
		values.add("Ram");
		values.add("Saheel"); 
		values.add("Hari"); 
		values.add("Babu"); // 5 -> size()-1
		
		//to sort the data
		Collections.sort(values);
		
		
		//System.out.println(values.size()); // 6
		
		// to get single item	
		//System.out.println(values.get(2));
		
		//to get last item
		//System.out.println(values.get(values.size()-1));
		
		//to remove an item using index
		//values.remove("Hari");
		
		//System.out.println(values.get(2));
		
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

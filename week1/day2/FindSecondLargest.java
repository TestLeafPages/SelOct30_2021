package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {100,49,398,34,1,267};
		
		//Step1 : find the length of the array
		int length = arr.length;
		
		// sort the array and print it
		Arrays.sort(arr);
		
		System.out.println(" SORTED ARRAY");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]: " + arr[i]);
		}
		
		//print the second largest number
		System.out.println(" second largset number :" + arr[length-2]);
		
		//print the second smallest number
		System.out.println("second smallest number: " + arr[1]);
		
	}

}

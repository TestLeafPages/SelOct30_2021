package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		String str1 = "hi";
		String str2 = "Hello";
		String str3 = "Welcome";

		// Arrays:
		// declare and initalize
		String strArray[] = { "hi", "Hello", "Welcome" };
		// String[] strArray = {"hi", "Hello", "Welcome"};
		int intArray[] = { 23, 45, 678, 345, 67, 100 };
		boolean boolArray[] = { true, false, true };
		char charArr[] = { 'a', 'f', 'r', 'g', 'r' };

		// create a new array of size 7 ( holds 7 elements)
		int array[] = new int[7];

		int numArray[] = { 100, 345, 34, 56, 235, 34 };
		
		System.out.println(numArray[3]);
		System.out.println(numArray[5]);
		
		// length of the array
		int lenArray = numArray.length;
		
		System.out.println(" Length of teh array: " + lenArray );
		
		// print all the elements of array
		// for (int i = 0; i < 6; i++) {
		// 0 to 5
		for (int i = 0; i < lenArray; i++) {
			System.out.println("numArray["+i+"]: " + numArray[i]);
		//	numArray[0]
		//	numArray[6]
		//ArrayIndexOutOfBoundsException
		}
		
		// print the last elemnt of the array
		System.out.println(" last elemnt: " + numArray[lenArray-1]);
		System.out.println(" last elemnt but one: " + numArray[lenArray-2]);
		// print the first elemnt of an array
		System.out.println(" First elemnt: " + numArray[0]);
		
		// sort
		Arrays.sort(numArray);
		System.out.println(" sorted array");
		for (int i = 0; i < lenArray; i++) {
			System.out.println("numArray["+i+"]: " + numArray[i]);
		}
			
		System.out.println("*************8");
		for (int i = lenArray-1; i >= 0; i--) {
			System.out.println("numArray["+i+"]: " + numArray[i]);
		}
		
		// find the largest number in an array
		
		
		
		

	}

}

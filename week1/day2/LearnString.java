package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// non primitive data type
		// created an object named str
		String str = "Have a good day";
		
		// 1. String Length: method
		int lengthStr = str.length();
		// ctrl + 2 L, ctrl 1
		// int length = str.length();
		System.out.println(" Length of the string:" + lengthStr);
		
		//2. Find a character in a String:
		char charAt = str.charAt(5);
		System.out.println(" Charatcter at the given index: " + charAt);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//3. Get the position of a character in the string:
		int indexOf = str.indexOf('a');
		System.out.println(" The index value of the given character :" + indexOf);
		
		//4. Get the last position of a character in the string:
		int lastIndexOf = str.lastIndexOf('a');
		System.out.println(" The last index value of the given character :" + lastIndexOf);
		// task for you : how to find the second occurence of a character?
		
		//5. Convert a string to a character array:
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"]: " + charArray[i]);
		}
		
		//6.Convert a string to words:
		String[] splitArr = str.split("-");
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println("splitArr["+i+"]: " + splitArr[i]);
		}
	
		//7. Get a part of the string:
		String substring = str.substring(5);
		System.out.println(" Substring from 5:" + substring);
		// Rs.5000
		
		String amnt = "rs.18000";
		String substring2 = amnt.substring(3);
		System.out.println(substring2);
		
		String substring3 = str.substring(5, 8);  // from 5 till 7
		// start index - Inclusive 
		// end index is exclusive
		System.out.println(substring3);
		
		// 8.Replace a character:
		String replace = str.replace('a', 'A');
		System.out.println(" replaced string:" + replace);
		// HAve A good dAy
		
		//9. Replace all the integers, non integers:
	    String str1 = "TestLeaf102839";
	    //regular expressions(video) -D( non integers), d - integers
	    String replaceAll = str1.replaceAll("[\\D]", ""); //- Replace all the non integers by null(all except numbers)
	   System.out.println(replaceAll); //    102839
	    String replaceAll2 = str1.replaceAll("[\\d]", ""); //- Replace all the integers by null
	    System.out.println(replaceAll2); // TestLeaf
	    
	    //10. Compare two strings:
	    // ==
	    // equals
	   

	}

}

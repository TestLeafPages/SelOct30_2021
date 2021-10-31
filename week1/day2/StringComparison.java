package week1.day2;

public class StringComparison {

	public static void main(String[] args) {

		// ==
		// equals
		// creating a string object using literals(data)
		String str1 = "Testleaf";
		String str2 = "Testleaf";
		String str3 = "hi";

		// == : check the memory reference
		// equals : check the content/value

	/*	if (str1.equals(str2)) {
			System.out.println(" same content");
		} else
			System.out.println(" diff content");*/

		if (str1 == str2)
			System.out.println(" same memory");
		else
			System.out.println("diff memory");
		
		
		// creating a string object using new operator
		String strNew = new String();
		strNew = "Using Object";
		String strNew1 = new String();
		strNew1 = "Using Object";
		
		
	}

}

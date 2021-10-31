package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String str = "welcome";
		// conevrt to char array
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}
			else {
				System.out.print(charArray[i]);
			}
		}
	}
}

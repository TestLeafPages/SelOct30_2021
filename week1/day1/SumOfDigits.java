package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 123;
		int quotient=0, reminder, sum =0;
		
		while(number!=0) {
			// 1
			quotient=number/10;
			// q = 0
			reminder = number%10;
			// r = 1
			sum = sum + reminder;
			// sum = 0+3 = 3
			// sum = 3+2 =5 
			// sum = 5+1 = 6
			number = quotient;
			//0
		}

		
		System.out.println(" sum of digits: " + sum);
	}
}

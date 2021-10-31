package week1.day1;

public class LearnForLoop {
	
	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("************************");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("*********************");
		
		// for loop
		// initialization; condition; iteration
		
		for (int i = 5; i <= 7; i++) {
			// i++ --> i = i+1;
			// i = 5;  validated the condition : 5 <= 7( true); print 5; i++ --> i=6
			// i = 6; 6<=7 ( true); print 6; i = 7;
			// i =7; 7<=7 (true); print 7; i = 8;
			// i =8 ; 8<=7 (false); out of the for loop
			System.out.println(i);
		}
	}
}

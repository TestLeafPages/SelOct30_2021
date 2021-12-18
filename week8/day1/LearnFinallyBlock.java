package week8.day1;

public class LearnFinallyBlock {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		

		try {
			System.out.println(x / y);
			
		} finally {
			System.out.println("finally code");
		}
		
		System.out.println("End of Program");

	}

}

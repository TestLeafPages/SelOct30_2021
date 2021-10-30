package week1.day1;

public class LearnReturn {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				return; // contol out of the method
			}
			System.out.println(i);
		}
		
		System.out.println(" out of the for loop");
		

	}

}

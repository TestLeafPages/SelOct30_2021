package week1.day1;

public class LearnContinue {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				continue; // skip the loop for the current value
			}
			System.out.println(i);
			
		}
		System.out.println(" out of the for loop");
	}

}

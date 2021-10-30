package week1.day1;

public class LearnBreak {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // skip the loop for the current value
			}
		}
		System.out.println(" out of for loop");
	}
}

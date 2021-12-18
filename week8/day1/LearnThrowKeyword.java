package week8.day1;

public class LearnThrowKeyword {
	
	public void divide(int num1, int num2) {
		if(num1 > num2) {
		System.out.println(num1/num2);
		} else {
			throw new ArithmeticException("Invalid inputs - input1 is lesser than input2");
		}

	}

	public static void main(String[] args) {
		LearnThrowKeyword ltk = new LearnThrowKeyword();
		
		try {
			ltk.divide(10, 20);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("End of program");

	}

}

package week3.day1;

public class Calculator {
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		calc.add(10, 20, 30);
	}

}

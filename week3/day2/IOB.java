package week3.day2;

public class IOB implements RBI{

	
	
	public void minimumBalance() {
		System.out.println("5000");
	}

	public void maximumLoanAmount() {
		System.out.println("100000");
	}
	

	public void repoRate() {
		System.out.println("7");
		
	}
	
	public void agriLoan() {
		System.out.println("50000");
	}
	
	public void studyLoan() {
		System.out.println("10000");
	}

	public static void main(String[] args) {
		IOB iob = new IOB();
		
		iob.maximumLoanAmount();
		iob.minimumBalance();
		iob.agriLoan();
		iob.studyLoan();
	}

	
	
	
	

}

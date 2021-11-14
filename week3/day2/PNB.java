package week3.day2;

public class PNB implements CIBIL{

	public void creditScore() {
		System.out.println("7");
		
	}
	
	public void minimumBalance() {
		System.out.println("3000");
	}

	
	public void maximumLoanAmount() {
		System.out.println("300000");
		
	}
	
	public static void main(String[] args) {
		PNB pnb = new PNB();
		pnb.minimumBalance();
		pnb.maximumLoanAmount();
		pnb.creditScore();
		pnb.repoRate();
	}

	
	public void repoRate() {
		System.out.println("8");
	}


}

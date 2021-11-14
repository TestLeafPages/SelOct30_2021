package week3.day2;

public class SBI implements RBI{
	
	public void ITLoan() {
		System.out.println("100000");

	}

	public void minimumBalance() {
		System.out.println("2000");		
	}

	public void maximumLoanAmount() {
		System.out.println("200000");
		
	}
	
	public static void main(String[] args) {
		IOB iob = new IOB();
		iob.minimumBalance();
		iob.maximumLoanAmount();
		iob.agriLoan();
		
		
		
		/*
		 * SBI sbi = new SBI();
		 * 
		 * sbi.minimumBalance(); sbi.maximumLoanAmount(); sbi.ITLoan();
		 */
		  
	}

	@Override
	public void repoRate() {
		// TODO Auto-generated method stub
		
	}

}

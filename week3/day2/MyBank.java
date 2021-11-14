package week3.day2;

public class MyBank {

	public static void main(String[] args) {
		//IOB bank = new IOB();
		//SBI bank = new SBI();
		
		RBI bank = new IOB();
		
		
		//implemented for RBI
		bank.minimumBalance();
		bank.maximumLoanAmount();
		bank.repoRate();
		
				
		//from IOB
		//bank.studyLoan();
		//bank.agriLoan();
		
		//from SBI
		//bank.ITLoan();
		
		
		

	}

}

package week3.day1;

public class SBIMdu extends SBI{
		
	public void homeLoan() {
		System.out.println("Home Loan");

	}
	
	public void savingsAccount() {
		System.out.println("8%");
	}
	
	/*
	 * public void fixedDeposit() { System.out.println("10%"); }
	 */
	
	public static void main(String[] args) {
		
		SBIMdu sbi = new SBIMdu();
		sbi.fixedDeposit();
		sbi.savingsAccount();
		
		/*
		 * SBIMdu sm = new SBIMdu();
		 * 
		 * sm.savingsAccount(); sm.fixedDeposit();
		 */
		
	}

}

package week3.day2;

public class TNGovt extends FinanceMinistry{

	public void covidVaccine() {
		System.out.println("vaccine dose 2");

	}
	
	public void disasterLoan() {
		System.out.println("2500");
	}
	
	public static void main(String[] args) {
		TNGovt tng = new TNGovt();
		
		tng.disasterLoan();
		tng.covidVaccine();
	}

}

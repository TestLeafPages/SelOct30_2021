package week7.day1;

public class EmployeeInfo {
	
	int employeeId;
	String employeeName;
	
	EmployeeInfo(int employeeId, String employeeName){
		//this(); // to call default constructor
		System.out.println("Parameterized constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
		
	EmployeeInfo(){
		this(100,"Hari");
		System.out.println("Default constructor");
	}

	public void printDetails() {
		System.out.println(employeeId+" "+employeeName);

	}
	
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.printDetails();
		
		
		String text = new String("Welcome");
		
		

	}

}

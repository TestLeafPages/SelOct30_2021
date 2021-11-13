package week3.day1;

public class EmployeeInfo {
	
	//Babu
	
	public void getEmployeeInfo() {
		System.out.println("Employee detail");
		
	}
	
	public void getEmployeeInfo(String empName) {
		System.out.println(empName+" Employee detail");
		
	}
	
	public void getEmployeeInfo(int empId) {
		System.out.println(empId+" Employee detail");

	}
	
	public void getEmployeeInfo(String empName, int empId) {
		
		System.out.println(empName+" "+empId+" Employee detail");

	}
	
	
	public void getEmployeeInfo(int empPhNo, String empEmail) {
		System.out.println(empPhNo+" "+empEmail+" Employee detail");

	}
	
	
	
	public static void main(String[] args) {
		
		
		  EmployeeInfo emp = new EmployeeInfo();
		  
		  emp.getEmployeeInfo(); emp.getEmployeeInfo("Hari"); emp.getEmployeeInfo(100);
		  emp.getEmployeeInfo("Hari",100);
		  emp.getEmployeeInfo(8884151,"test@testleaf.com");
		 
		
		
		
	}
	

}

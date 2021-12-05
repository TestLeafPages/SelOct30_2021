package week6.day2;

public class EmployeeInfo {

	static {
		System.out.println("Block of code1");
		System.out.println("Block of code2");
	}
	
	
	public static void main(String[] args) {
	// ClassName.methodName();	
		Employees.getEmployeeInfo();
		
		Employees emp1 = new Employees(100,"Hari","TestLeaf");
		Employees emp2 = new Employees(100,"Hari","TestLeaf");
		Employees.getEmployeeInfo();

	}
	
	
}

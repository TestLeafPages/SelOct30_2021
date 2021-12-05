package week6.day2;

public class Employees {
	int empId;
	String empName;
	static String compName;
	
	Employees(int id,String name,String company){
		empId = id;
		empName = name;
		compName = company;
	}
	
	public void printDetails() {
		System.out.println(empId+" "+empName+" "+compName);

	}
	
	public static void getEmployeeInfo() {
		System.out.println(" static method");

	}

	public static void main(String[] args) {
		Employees emp1 = new Employees(100,"Hari","TestLeaf"); //compName = TestLeaf
		Employees emp2 = new Employees(200,"Prasad","Qeagle"); //compName = Qeagle
		Employees emp3 = new Employees(300,"Babu","Qeagle Software Solutions"); 
		
		emp1.printDetails();
		emp2.printDetails();
		emp3.printDetails();
		
		getEmployeeInfo();
		
		
	}

}

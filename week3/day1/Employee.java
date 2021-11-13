package week3.day1;

public class Employee {
	int empId;
	String empName;
	boolean empStatus;
	
	Employee(){
		System.out.println("Default Constructor");
	}
	
	Employee(int id, String name, boolean status){
		System.out.println("parameterised Constructor");
		empId= id;
		empName = name;
		empStatus = status;
	}
	
	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		
		  Employee emp = new Employee(100,"Hari",true);
		  
		  System.out.println(emp.empId); 
		  System.out.println(emp.empName);
		  System.out.println(emp.empStatus);
		 
		//System.out.println("Hari");
		
	}

}

package week3.day1;

//F4 -> to get hierarchy
public class Vehicle {
	
	//default access -> package level access
	//private access -> within the class
	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	
	
	
	
	
	
	
	public void soundHorn() {
		System.out.println("sound horn");
	}
	
	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		
	}
	

}

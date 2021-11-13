package week3.day1;

public class BMW extends Car{
	
	public void airBag() {
		System.out.println("air bag");
	}
	
	public void airCondition() {
		System.out.println("AC");

	}
	
	public static void main(String[] args) {
		BMW bmw = new BMW();
		
		bmw.airBag(); //BMW
		bmw.airCondition(); //BMW
		
		bmw.applyGear(); //Car
		bmw.driveCar(); //Car
		
		bmw.applyBrake(); //Vehicle
		bmw.soundHorn();  //Vehicle
		
	
		
	}
	
	

}

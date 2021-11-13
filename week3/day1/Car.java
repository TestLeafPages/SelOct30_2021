package week3.day1;

public class Car extends Vehicle{

	public void driveCar() {
		System.out.println("drive car");

	}

	public void applyGear() {
		System.out.println("apply gear");

	}

	public static void main(String[] args) {
		
		/*
		 * Car myCar = new Car();
		 * 
		 * myCar.applyGear(); myCar.driveCar();
		 * 
		 * myCar.applyBrake(); myCar.soundHorn();
		 */
		  
		 

		
		  Vehicle veh = new Vehicle(); 
		  veh.applyBrake();
		 

		/*
		 * Car myCar = new Car();
		 * 
		 * myCar.applyGear(); myCar.driveCar();
		 * 
		 * Vehicle veh = new Vehicle();
		 * 
		 * veh.applyBrake(); veh.soundHorn();
		 */

	}

}

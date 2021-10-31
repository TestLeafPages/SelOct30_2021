package week1.day2;

public class MyMobile {
	// Instance variables/Global
	String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI = "430004050";
	char brandName = 'S';
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;
	
	// AccessSpecifier returnType methodName (pass the arguments) {Method Body}
	// AccessSpecifier:
	// 1. public  :
	// 2. Private :
	// 3. Protected : < Pending>
	// 4. Package/Default
	
	// returnType
	
	// () : Pass arguments
	public void makeCalls() {
		System.out.println(" Making calls");
	}
	
	public boolean isTouchScreen() {
		isTouchScreen = true;
		return isTouchScreen;
	}
	
	public String getSMS() {
		return IMEI;
	}
	
	private void payBills() {
		System.out.println(" Pay Bills");
	}
	
	public void calcBillAmount(int x, int y) {
		int sum = x+y;
		System.out.println(" calculated bill amount : " + sum);
	}
	
	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		boolean isTouch = obj.isTouchScreen();
		System.out.println(" isTouch : " + isTouch);
		String imei = obj.getSMS(); // get the value from the method
		System.out.println(imei);
		obj.calcBillAmount(20000, 30000); // pass the values to the method as arguments
	}
}

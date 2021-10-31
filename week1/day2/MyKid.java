package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		
		MyMobile objMob = new MyMobile();
		System.out.println(objMob.brandName);
		System.out.println(objMob.IMEI);
		
		objMob.makeCalls();  // public methd
	//	objMob.payBills();   // private methd
		
	}

}

package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 6000;
	long chassisNumber = 23456789L;
	boolean isPunctured = false;
	String bikeName =  "YamahaSZ100";
	double runningKM = 12355.2345;

	public static void main(String[] args) {
		TwoWheeler twoWheeler = new TwoWheeler();
		System.out.println(twoWheeler.noOfWheels);
		System.out.println(twoWheeler.noOfMirrors);
		System.out.println(twoWheeler.chassisNumber);
		System.out.println(twoWheeler.isPunctured);
		System.out.println(twoWheeler.bikeName);
		System.out.println(twoWheeler.runningKM);

	}

}

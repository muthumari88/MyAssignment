package week1.day1;

public class MobilePhone {
	
	public void cellPhone() {
		String mobileBrandName="Samasung Galaxy M30";
		char mobileLogo = 'M';
		short noOfMobilePiece = 1230;
		int modelNumber = 234566;
		long mobileImeiNumber = 120023020345098L;
		float mobilePrice = 35896.3456f;
		boolean isDamaged= false;
		System.out.println(mobileBrandName);
		System.out.println(mobileLogo);
		System.out.println(noOfMobilePiece);
		System.out.println(modelNumber);
		System.out.println(mobileImeiNumber);
		System.out.println(mobilePrice);
		System.out.println(isDamaged);
	}

	public static void main(String[] args) {
		MobilePhone sim= new MobilePhone();
		sim.cellPhone();
	}

}

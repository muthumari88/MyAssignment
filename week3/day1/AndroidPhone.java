package week3.day1;

public class AndroidPhone extends Mobile {

	public void takeVideo() {
		System.out.println("This Method in Android class is used to take Video");
	}

	public void apmethods() {
		System.out.println("This is the protectd method from apmethods");
	}

	public static void main(String[] args) {

		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
	}

}

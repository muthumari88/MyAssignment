package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make a call method is called here");

	}
	public void sendMsg() {
System.out.println("Send Message Method is called here");		

	}

	public static void main(String[] args) {
		 Mobile cellPhone = new Mobile();
		cellPhone.makeCall();
		cellPhone.sendMsg();

	}

}

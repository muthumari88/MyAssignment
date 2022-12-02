package week3.day1;

public class SmartPhone extends AndroidPhone {

	void connectWhatsApp() {
		System.out.println("This Method in Smartphone is used to connect whatsapp");
	}

	protected void newmethod() {
		System.out.println("This is the proected method in smartphone class");
	}

	public void takeVideo() {
		System.out.println("This methos is overridden from parent hence child should executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.sendMsg();
		phone.makeCall();
		phone.takeVideo();
		phone.connectWhatsApp();
	}

}

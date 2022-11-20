package week3.day1;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a = new Automation();
		a.java();
		a.python();
		a.ruby();
		a.Selenium();
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This is the Jave method in Automation");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This is the ruby override method in Automation");

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This is the abstract Selenium method in Automation");
	}

}

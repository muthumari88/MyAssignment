package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("This is the method in desktop class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dp = new Desktop();
		dp.computerModel();
		dp.desktopSize();

	}

}

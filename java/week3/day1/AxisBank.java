package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Method in deposit class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
	}

}

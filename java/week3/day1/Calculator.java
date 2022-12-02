package week3.day1;

public class Calculator {
	public void addition(int num1, int num2) {
		// TODO Auto-generated method stub
		int num3 = num1 + num2;
		System.out.println("This Result is from the addition of two integers" + num3);
	}
	public void addition(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int num4 = num1 + num2 + num3;
		System.out.println("This Result is from the addition of three integers" + num4);
	}
	public void subtraction(double sub1, double sub2) {
		double sub3 = sub1 - sub2;
		System.out.println("This Result is from the subtraction of two double" + sub3);
	}
	public void subtraction(int sub1, int sub2) {
		int sub4 = sub1 - sub2;
		System.out.println("This Result is from the subtraction of two integers" + sub4);
	}
	public void mul(int mul1, double mul2) {
		double mul3 = mul1 * mul2;
		System.out.println("This Result is from the multiplication of one int and one double" + mul3);
	}
	public void mul(double mul1, double mul2) {
		double mul4 = mul1 * mul2;
		System.out.println("This Result is from the multiplication of two double" + mul4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.addition(2, 3);
		cal.addition(2, 3, 10);
		cal.subtraction(898787, 217399);
		cal.subtraction(23, 12);
		cal.mul(1243242, 313222);
		cal.mul(2, 12133434);

	}
}

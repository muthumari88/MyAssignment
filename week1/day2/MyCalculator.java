package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator ope = new Calculator();
		int sum1 = ope.add(10, 20, 30);
		System.out.println("The sum of three values are :" + sum1);
		int sub1 = ope.sub(45, 25);
		System.out.println("The subtraction of two values are :" + sub1);
		double mul1 = ope.mul(45.55, 34.45);
		System.out.println("The multiplication of two values are :" + mul1);
		float div1 = ope.divide(12.6f, 3.3f);
		System.out.println("The Division of two values are :" + div1);

	}

}

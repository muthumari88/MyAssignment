package week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int add1 = num1 + num2 + num3;
		return add1;
		// other way of returning data is
		// return num1 +num2 + num3
	}

	public int sub(int num1, int num2) {
		int sub1 = num1 - num2;
		return sub1;
	}

	public double mul(double num1, double num2) {
		double mul1 = num1 * num2;
		return mul1;
	}

	public float divide(float num1, float num2) {
		float div1 = num1 / num2;
		return div1;
	}

}

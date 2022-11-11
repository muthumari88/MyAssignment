package week1.day2;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int input=153;
		int calculated=0;
		int remainder;
		int original=input;
		while (input>0) {
			remainder=input %10;
			input=input/10;
			calculated=calculated+(remainder*remainder*remainder);
		}
		if (calculated==original) {
			System.out.println("The Given Number is Armstrong Number");
		}
		else {
			System.out.println("The Given Number is not an Armstrong Number");
		}
	}

}

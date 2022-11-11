package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int num = -45;
		if (num > 0)
		{
			System.out.println("The Given Number is positive");
		}
		else if(num <0) {
			System.out.println("The Given Number is Negative");
		}
		else
			System.out.println("The Given Number is neither Negative nor Positive");
	}

}

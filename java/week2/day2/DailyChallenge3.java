package week2.day2;

public class DailyChallenge3 {

	public static void main(String[] args) {
		/*
		 * Write an algorithm to determine if a number n is happy.
		 * 
		 * A happy number is a number defined by the following process:
		 * 
		 * Starting with any positive integer, replace the number by the sum of the
		 * squares of its digits. Repeat the process until the number equals 1 (where it
		 * will stay), or it loops endlessly in a cycle which does not include 1. Those
		 * numbers for which this process ends in 1 are happy. Return true if n is a
		 * happy number, and false if not.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: n = 19 Output: true Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 =
		 * 100 12 + 02 + 02 = 1 Example 2:
		 * 
		 * Input: n = 2 Output: false
		 */
		//Command.driver.get("WWW.Google.com");
		/*
		 * int input = 19; int remainder; for (int i = input; i > 1; i--) { remainder =
		 * input % 10; input = input / 10; input = (remainder * remainder) + (input *
		 * input); System.out.println(input);100 }
		 * 
		 * if (input == 1) { System.out.println("The Given Number is Happy"); } else {
		 * System.out.println("The Given Number is not Happy"); }
		 */
	}
}

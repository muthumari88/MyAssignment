package week2.day2;

//import java.util.Iterator;

public class ChangeOddIndexToUpperCase {
	/*
	 * Pseudo Code
	 * 
	 * Declare String Input as Follow
	 * 
	 * String test = "changeme";
	 * 
	 * a) Convert the String to character array
	 * 
	 * b) Traverse through each character (using loop)
	 * 
	 * c)find the odd index within the loop (use mod operator)
	 * 
	 * d)within the loop, change the character to uppercase, if the index is odd
	 * else don't change
	 */
	public static void main(String[] args) {
		String test = "changeme";
		String test1 = "";
		char c;
		char c1;
		int len = test.length();
		// System.out.println(chars.length);
		for (int i = 0; i < len; i++) {

			if (i % 2 != 0) {
				c = test.charAt(i);
				c1 = Character.toUpperCase(c);
				test1 = test1 + c1;
			} else
				test1 = test1 + test.charAt(i);

		}
		System.out.println(test1);

	}
}

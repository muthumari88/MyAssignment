package week2.day2;

//import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b) Initialize
		 * an integer variable as count c) Split the String into array and iterate over
		 * it d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. f) if the count > 1 then
		 * replace the word as ""
		 * 
		 * g) Displaying the String without duplicate words
		 */

		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		int count = 0;
		for (int i = 0; i < text1.length; i++) {
			count=1;
			for (int j = i + 1; j < text1.length; j++) {
				if (text1[i] == text1[j]) {
					count++;
					while (count == 0) {
						System.out.println(text1[i]);
					}
				} else {
					System.out.println(text1[j]);
				}

			}
		}
	}
}

package week3.day2;

//import java.util.HashMap;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		Set<String> text2 = new HashSet<String>();
		for (int i = 0; i < text1.length; i++) {
			text2.add(text1[i]);
		}
		System.out.println(text2);
	}
}

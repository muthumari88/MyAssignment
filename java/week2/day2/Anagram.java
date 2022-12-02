package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * 
		 * Declare a String String text1 = "stops"; Declare another String String text2
		 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
		 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
		 * the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "posts";
		int count = 0;
		if (text1.length() == text2.length()) {
			char[] text3 = text1.toCharArray();
			char[] text4 = text2.toCharArray();
			Arrays.sort(text3);
			Arrays.sort(text4);
			for (int i = 0; i < text3.length; i++) {
				if (text3[i] == text4[i]) {
					count++;
				} else {
					count--;
				}
			}
		} else {
			System.out.println("The Given two word length is not same hence Anagram is not possible");
		}
		if (text1.length() == count) {
			System.out.println("The Given two words are anagram");
		} else {

		}

	}

}

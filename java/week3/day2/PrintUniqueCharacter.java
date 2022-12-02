package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array b) Create a new Set -> HashSet c) Add
	 * each character to the Set and if it is already there, remove it d) Finally,
	 * print the set
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Muthumari";
		String namel = name.toLowerCase();
		System.out.println(namel);
		char[] name1 = namel.toCharArray();
		Set<Character> name2 = new HashSet<Character>();
		for (int i = 0; i < name1.length; i++) {
			name2.add(name1[i]);
		}
		System.out.println(name2);
	}

}

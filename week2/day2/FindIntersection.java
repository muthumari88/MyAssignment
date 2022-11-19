package week2.day2;

//import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * 
		 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
		 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
		 * a nested for another array from 0 to array length e) Compare Both the arrays
		 * using a condition statement
		 * 
		 * f) Print the first array (should match item in both arrays)
		 */
		System.out.println("The following numbers are present in both the Arrays");
		int[] Array1 = new int[] { 3, 2, 11, 4, 6, 7 };
		int[] Array2 = new int[] { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i < Array1.length; i++) {
			for (int j = 0; j < Array2.length; j++) {
				if (Array1[i] == Array2[j]) {
					System.out.println(Array1[i]);

				}
			}
		}

	}

}

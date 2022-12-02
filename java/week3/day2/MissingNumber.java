package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
	/*
	 * Problem
	 * 
	 * There will be running number between 1 to 10 One of the unique number will be
	 * missing Find the missing number
	 * 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
	 * order c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		Map<Integer, Integer> nummap = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			// nummap.put(num[i], value + 1);
			// nummap.put(num[i],num[i].get(num[i]));
			nummap.put(num[i], nummap.getOrDefault(num[i], 0) + 1);
			if (nummap.get(num[i]) ==nummap.get(num[i+1])) {
				
			} else {

			}
			// this one line code to get the value
		}
		System.out.println(nummap);
	}

}

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.IfFunc;

public class JavaChallenge6 {
	/*
	 * Java Problem (6/20)
	 * 
	 * Given an array nums of size n, return the majority element.
	 * 
	 * 
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
	 * may assume that the majority element always exists in the array.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,2,3] Output: 3
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [2,2,1,1,1,2,2] Output: 2
	 */

	public static void main(String[] args) {
		int[] num = { 1, 2, 1, 3, 2, 5 };
		Map<Integer, Integer> nummap = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (nummap.containsKey(num[i])) {
				int value = nummap.get(num[i]);
				System.out.println(value);
				nummap.put(num[i], value + 1);
				System.out.println(nummap);
				// nummap.put(num[i],num[i].get(num[i]));
				// nummap.put(num[i],nummap.getOrDefault(num[i),0)+1); instead of if else use
				// this one line code to get the value
			} else
				nummap.put(num[i], 1);

		}
		List<Integer> data2 = new ArrayList<Integer>(nummap.get(nummap));
		Collections.sort(data2);
		System.out.println(data2);
	}
}

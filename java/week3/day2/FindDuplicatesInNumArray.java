package week3.day2;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class FindDuplicatesInNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 1, 3, 2, 5 };
		Map<Integer, Integer> nummap = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (nummap.containsKey(num[i])) {
				int value = nummap.get(num[i]);
				nummap.put(num[i], value + 1);
				// nummap.put(num[i],num[i].get(num[i]));
				// nummap.put(num[i],nummap.getOrDefault(num[i),0)+1); instead of if else use this one line code to get the value
			} else
				nummap.put(num[i], 1);
		}
		System.out.println(nummap);

	}

}

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//import org.openqa.selenium.WebElement;

public class FindSecondLargest {
	/*
	 * Pseudo Code: a) Create a empty Set Using TreeSet b) Declare for loop iterator
	 * from 0 to data.length and add into Set c) converted Set into List d) Print
	 * the second last element from List
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		Set<Integer> data1 = new TreeSet<Integer>();
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			data1.add(data[i]);
		}
		List<Integer> data2 = new ArrayList<Integer>(data1);
		Collections.sort(data2);
		System.out.println(data2);
		System.out.println(data2.get(data2.size() - 2));
	}

}

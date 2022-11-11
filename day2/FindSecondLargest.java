package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int arr_Size = data.length;
		Arrays.sort(data);
		System.out.println("The Second largest number is :" + data[arr_Size - 2]);
	}

}

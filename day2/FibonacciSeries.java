package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 10;
		int firstnum = 0;
		int secnum = 1;
		System.out.println("FibonacciSeries of given Range " + range + " is:");
		System.out.println("Firstnum is  : " + firstnum);
		System.out.println("secondnum is : " + secnum);
		for (int i = 1; i < range; i++) {

			int sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
		}
	}

}

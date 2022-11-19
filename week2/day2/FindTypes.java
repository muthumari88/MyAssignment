package week2.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] test1 = test.toCharArray();
		for (int i = 0; i < test1.length; i++) {
			if (Character.isLetter(test1[i])) {
				letter++;
			} else if (Character.isSpaceChar(test1[i])) {
				space++;
			} else if (Character.isDigit(test1[i])) {
				num++;
			} else {
				specialChar++;
			}
		}
		System.out.println("The number of Letters in the given senetence is : " + letter);
		System.out.println("The number of Space in the given senetence is : " + space);
		System.out.println("The number of Digits in the given senetence is : " + num);
		System.out.println("The number of Special Characters in the given senetence is : " + specialChar);
	}

}

package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a Software Tester";
		String[] tests = test.split(" ");
		String test1 = "";
		char[] c = {};
		for (int i = 0; i < tests.length; i++) {
			c = tests[i].toCharArray();
			if (i % 2 != 0) {
				test1 = test1 + c[i];
			} else {
				for (int j = tests[i].length() - 1; j <= 0; j--) {
					test1 = test1 + tests[j];
				}

			}
		}
		System.out.println(test1);
	}

}

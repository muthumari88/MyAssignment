package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chEnnai";
		String strl = str.toLowerCase();
		int count = 0;
		char occ = 'e';
		char[] str1 = strl.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == occ) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("The give letter '" + occ + "' present in the sentence " + count + " times");
		} else {

		}
	}

}

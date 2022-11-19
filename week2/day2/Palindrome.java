package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s = "maDam";
		String rev = "";
		String s1=s.replaceAll(" ", "").toLowerCase();
		int len = s1.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev += s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("The Given word is palindrom");
		} else {
			System.out.println("The Given word is not a palindrom");
		}

	}

}

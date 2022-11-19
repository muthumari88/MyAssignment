package week2.day2;

public class DailyChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String s1r = "";
		String s1 = s.replaceAll("[\\s,:]", "").toLowerCase();
		int s1l = s1.length();
		for (int i = s1l - 1; i >= 0; i--) {
			s1r = s1r + s1.charAt(i);
		}	
		if (s1.toLowerCase().equals(s1r)) {
			System.out.println("The Given Phrase " + s1 + " is Palindrome");
		} else {
			System.out.println("The Given Phrase " + s1 + " is not a Palindrome");
		}
		String s2 = "race a car";
		String s2r = "";
		String s22 = s2.replaceAll("[\\s,:]", "").toLowerCase();
		int s2l = s22.length();
		for (int i = s2l - 1; i >= 0; i--) {
			s2r = s2r + s1.charAt(i);
		}
		if (s22.toLowerCase().equals(s2r)) {
			System.out.println("The Given Phrase " + s22 + " is Palindrome");
		} else {
			System.out.println("The Given Phrase " + s22 + " is not a Palindrome");
		}
		String s3 = " ";
		String s3r = "";
		String s33 = s3.replaceAll("[\\s,:]", "").toLowerCase();
		int s3l = s33.length();
		for (int i = s3l - 1; i >= 0; i--) {
			s3r = s3r + s1.charAt(i);
		}
		if (s33.toLowerCase().equals(s3r)) {
			System.out.println("The Given Phrase " + s33 + " is Palindrome");
		} else {
			System.out.println("The Given Phrase " + s33 + " is not a Palindrome");
		}
	}

}

package week2.day2;

public class DailyChallange1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String[] split1 = s1.split(" ");
		int s4 = split1[split1.length - 1].length();
		System.out.println("The Last word is :" + split1[split1.length - 1] + " with the length of  :" + s4);
		String s2 = "   fly me   to   the moon  ";
		String[] split2 = s2.split(" ");
		int s5 = split2[split2.length - 1].length();
		System.out.println("The Last word is :" + split2[split2.length - 1] + " with the length of  :" + s5);
		String s3 = "luffy is still joyboy";
		String[] split3 = s3.split(" ");
		int s6 = split3[split3.length - 1].length();
		System.out.println("The Last word is :" + split3[split3.length - 1] + " with the length of  :" + s6);

	}

}

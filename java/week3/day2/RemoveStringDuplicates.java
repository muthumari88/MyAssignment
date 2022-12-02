package week3.day2;

//import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RemoveStringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		char[] str1 = companyName.toCharArray();
		Set<Character> name = new HashSet<Character>();
		for (int i = 0; i < str1.length; i++) {
			//String name1= String.valueOf(str1[i]);
			name.add(str1[i]);

		}
		System.out.println(name);
	}

}

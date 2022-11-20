package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("The Student Details are : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The Student Details are : " + id + "," + name);
	}

	public void getStudentInfo(String email, int id) {
		System.out.println("The Student Details are : " + id + "," + email);
	}

	public void getStudentInfo(double Phonenumber, String email) {
		System.out.println("The Student Details are : " + email + "," + Phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.getStudentInfo(1546309);
		s.getStudentInfo(1546309, "Muthumari");
		s.getStudentInfo("muthu.mari@gmail.com", 1546309);
		s.getStudentInfo(1592634785, "muthu.mari@gmail.com");

	}

}

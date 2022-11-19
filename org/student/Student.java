package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("This is the method studentName in Student class");
	}

	public void studentDept() {
		System.out.println("This is the method studentDept in Student class");
	}

	public void studentId() {
		System.out.println("This is the method studentId in Student class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}

}

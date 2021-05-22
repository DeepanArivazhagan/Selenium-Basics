package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Deepan");
	

	}
	
	public void studentDept() {
		System.out.println("EEE");
		
	}
	public void studentId() {
		System.out.println("123456");
		
	}
public static void main(String[] args) {
	Student Deepu = new Student();
	Deepu.collegeName();
	Deepu.collegeCode();
	Deepu.collegeRank();
	Deepu.deptName();
	Deepu.studentName();
	Deepu.studentDept();
	Deepu.studentId();
	
}
}

package com.tka.oct_07_task.task01;

public class TestStudentTask1 {
	public static void main(String[] args) {
		StudentTask1 s1 = new StudentTask1(1,"Pravin",80.76);
		StudentTask1 s2 = new StudentTask1(2,"Roneet",79.78);
		s1.displayStudentInformationMoreThan75();
		s2.displayStudentInformationMoreThan75();
	}
}

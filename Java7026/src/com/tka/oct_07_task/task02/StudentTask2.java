package com.tka.oct_07_task.task02;

public class StudentTask2 {
	int id;
	String name;
	double percentage;
	int marks1,marks2,marks3;
	StudentTask2(int id, String name,int marks1, int marks2, int marks3 ){
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	void displayStudentInformation() {
		double totalMarks = marks1+marks2+marks3;
		percentage = (totalMarks/300 )* 100;
		System.out.printf("Student id: "+id+"\nStudent name: "+name+"\nStudent percentage: %.2f\n",percentage);
		System.out.println("-------------------------");
	}
	
}

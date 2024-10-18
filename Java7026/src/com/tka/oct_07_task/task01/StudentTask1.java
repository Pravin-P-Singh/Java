package com.tka.oct_07_task.task01;

public class StudentTask1{
	int id;
	String name;
	double percentage;
	StudentTask1(int id,String name, double percentage){
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	void displayStudentInformationMoreThan75() {
		if(percentage > 75) {
			System.out.println("Display Students With More than 75%");
			System.out.println("Student id: "+id+"\nStudent name: "+name+"\nStudent percentage: "+percentage);
			System.out.println("----------------------------------");
		}
	}
}

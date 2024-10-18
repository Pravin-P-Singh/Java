package Task4_30sep24;

public class MStudent {
	int studentId;
	String studentName;
	int marks1;
	int marks2;
	int marks3;
	
	void displayStudent() {
		int totalMarks = marks1 + marks2 + marks3;
		double percentage = (totalMarks/300.0)*100;
		System.out.println("Student Id: "+ studentId + ", Student Name: " + studentName + ", Student Percentage: " + percentage );
	}
}

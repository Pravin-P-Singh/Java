package Task4_30sep24;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 1;
		s1.name = "Kunal";
		s1.percentage = 90.17;
		s1.course = "Computer Engineering";
		s1.displayStudent();
		
		s2.id = 2;
		s2.name = "Pravin";
		s2.course = "Artificial Intelligence and Machine Learning";
		s2.percentage = 99.99;
		s2.displayStudent();
	}
}

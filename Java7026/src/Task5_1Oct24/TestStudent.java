package Task5_1Oct24;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.accept(1, "Pravin","Computer Engineering", 99.99f);
		s1.display();
		Student s2 = new Student();
		s2.accept(2, "Gaurav"," Artificial Intelligence",99.98f);
		s2.display();
	}
}

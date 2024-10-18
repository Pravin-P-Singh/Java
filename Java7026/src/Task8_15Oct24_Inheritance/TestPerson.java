package Task8_15Oct24_Inheritance;

public class TestPerson {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Pravin",20,"BE",99.99f);
		s1.display();
		Employee e1 = new Employee(1,"Aditya",21,"Developer",70000.00);
		System.out.println(e1);
	}
}

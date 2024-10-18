package Task5_1Oct24;

public class TestThisStudent {
	public static void main(String[] args) {
		ThisStudent s1 = new ThisStudent();
		s1.accept(1,"Pravin");
		s1.display();
		
		ThisStudent s2 = new ThisStudent();
		s2.accept(2, "Gaurav");
		s2.display();
	}
}

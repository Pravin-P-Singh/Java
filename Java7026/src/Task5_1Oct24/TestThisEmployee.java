package Task5_1Oct24;

public class TestThisEmployee {
	public static void main(String[] args) {
		ThisEmployee e1 = new ThisEmployee();
		e1.accept(1001, "Bill Gates");
		e1.display();
		
		ThisEmployee e2 = new ThisEmployee();
		e2.accept(1002, "Elon Musk");
		e2.display();
		
	}
}

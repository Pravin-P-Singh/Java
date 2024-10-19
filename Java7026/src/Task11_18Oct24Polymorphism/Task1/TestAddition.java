package Task11_18Oct24Polymorphism.Task1;

public class TestAddition {
	public static void main(String[] args) {
		Addition A = new Addition();
		A.sum(2, 3);
		A.sum(2.0f, 3.0f);
		A.sum(2, 3, 4);
		A.sum(2.0f, 3.5f,4.7f);
	}
}

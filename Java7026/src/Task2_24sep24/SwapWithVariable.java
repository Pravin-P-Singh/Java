package Task2_24sep24;

public class SwapWithVariable {
	public static void main(String[] args) {
		int a = 5,b = 15;
		System.out.println("Before swapping: a = "+ a +" b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = "+ a +" b = " + b);
	}
}

package Task11_18Oct24Polymorphism.Task1;

public class Addition {
	void sum(int a, int b) {
		int result = a+b;
		System.out.println("Sum: "+result);
	}
	void sum(float a, float b) {
		float result = a+b;
		System.out.println("Sum: "+result);
	}
	void sum(int a, int b,int c) {
		int result = a+b+c;
		System.out.println("Sum: "+result);
	}
	void sum(float a, float b, float c) {
		float result = a+b+c;
		System.out.println("Sum: "+result);
	}
}

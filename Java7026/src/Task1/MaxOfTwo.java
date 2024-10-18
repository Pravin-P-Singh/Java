package Task1;

public class MaxOfTwo {
	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		
		//brute-force
		//approach 1
		if(a>b) {
			System.out.println("a is larget: "+a);
		} else {
			System.out.println("b is largest: "+b);
		}
		//better-approach
		//approach 2 (ternary operator)
		int max = a>b?a:b;
		System.out.println("max element is: "+max);
		
	}
}

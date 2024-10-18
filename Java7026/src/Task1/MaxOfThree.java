package Task1;

public class MaxOfThree{
	public static void main(String[] args) {
		//max of three numbers
		int a = 3;
		int b = 10;
		int c = 5;
		
		//brute-force
		//approach1
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest: "+a);
			}
			else {
				System.out.println("c is largest: "+c);
			}
		} else {
			if(b > c) {
				System.out.println("b is largest: "+b);
			} else {
				System.out.println("c is largest: "+c);
			}
		}
		//approach2
		int max = 0;
		if(a>b) {
			if(a>c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("Max element is: "+ max);
		
		//best-approach(ternary operator)
		//approach 3
		int maxElement = a > b?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Max element is: "+maxElement);
		
		
	}
}

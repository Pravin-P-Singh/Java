package Task6_11Oct24;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int number = 123;
		int temp = number;
		int countDigits = 0;
		while(number > 0) {
			countDigits++;
			number/=10;
		}
		System.out.println("Number of digits in "+temp+" are "+countDigits);
	}
}

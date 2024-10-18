package Task6_11Oct24;

public class ReverseOfNumberDigits {
	public static void main(String[] args) {
		int number = 123;
		int rev = 0;
		while(number > 0) {
			int remainder = number%10;
			rev = rev*10 + remainder;
			number/=10;
		}
		System.out.println("Reverse of the number is: "+rev);
	}
}

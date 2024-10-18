package Task6_11Oct24;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 1221;
		int rev = 0;
		int temp = number;
		while(number > 0) {
			int remainder = number%10;
			rev = rev*10 + remainder;
			number/=10;
		}
		if(temp == rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
	}
}

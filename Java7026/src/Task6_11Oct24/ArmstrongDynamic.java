package Task6_11Oct24;

public class ArmstrongDynamic {
	public static void main(String[] args) {
		int number = 8208;
		int sum = 0,temp=number;
		int digits = countDigits(number);
		//Armstrong logic
		while(number > 0) {
			int remainder = number%10;
			sum+=Math.pow(remainder, digits);
			number/=10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
	static int countDigits(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num/=10;
		}
		return count;
	}
}

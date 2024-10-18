package Task6_11Oct24;

public class ArmStrong {
	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int temp = num;
		while(num > 0) {
			int remainder = num%10;
			sum+=Math.pow(remainder,3);
			num/=10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}

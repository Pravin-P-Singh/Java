package Task6_11Oct24;

public class SumOfNumberDigits {
	public static void main(String[] args) {
//		int number = 12345;
//		int sumOfDigits = 0;
//		while (number > 0) {
//			int remainder = number % 10;
//			sumOfDigits += remainder;
//			number /= 10;
//		}
//		System.out.println("Sum of digits is: " + sumOfDigits);
		int boxes = survive(6,5,10);
		System.out.println(boxes);
	}
	static int survive(int n, int k, int m) {
		int countBoxes = 0;
		int countDays = 0;
		int sweetsRemaining = m;
		for(int i = 1; i <= n; i++) {
			countDays++;
			if(sweetsRemaining >= k) {
				sweetsRemaining = sweetsRemaining - k;
			} else {
				if(countDays%7!=0 && countDays<=n) {
					sweetsRemaining += m;
					sweetsRemaining = sweetsRemaining - k;
					countBoxes++;
				} else {
					return -1;
				}
			}
		}
		return countBoxes;
	}
}

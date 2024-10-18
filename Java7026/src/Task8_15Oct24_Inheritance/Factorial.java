package Task8_15Oct24_Inheritance;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = findFactorial(num);
		System.out.println("Factorial of"+num + " is : "+result);
	}
	static int findFactorial(int num) {
		int fact = 1;
		for(int i=1; i <=num;i++) {
			fact*=i;
		}
		return fact;
	}
}

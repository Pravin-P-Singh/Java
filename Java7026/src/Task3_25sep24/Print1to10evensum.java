package Task3_25sep24;

public class Print1to10evensum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of 1-10 even numbers is: "+sum);
	}
}

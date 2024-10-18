package Task3_25sep24;

public class Print1to10evenAndodd {
	public static void main(String[] args) {
		//first print all even
		for(int i = 1; i <= 10; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		//then print all odd
		for(int i = 1; i <= 10; i++) {
			if(i%2!=0) {
				System.out.print(i+ " ");
			}
		}
	}
}

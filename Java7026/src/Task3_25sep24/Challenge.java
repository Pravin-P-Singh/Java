package Task3_25sep24;

public class Challenge {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 0)
				System.out.println(i + "--welcome");
			else if (i % 2 == 0)
				System.out.println(i + "--hello");
			else
				System.out.println(i + "--hiii");
		}
	}
}

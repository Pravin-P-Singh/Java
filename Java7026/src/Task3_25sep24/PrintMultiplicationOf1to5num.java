package Task3_25sep24;

public class PrintMultiplicationOf1to5num {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1; i <= 5; i++) {
			product*=i;
		}
		System.out.println("Product of 1 - 5 numbers is: "+product);
		
		//doubt tha isliye table bhi print kardiya
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}

package Task1;

public class PositiveOrNegativeOrZero {
	public static void main(String[] args) {
		//using ladder if-else
		int num = -10;
		if(num==0){
			System.out.println("Number is 0(zero): "+num);
		} else if(num < 0) {
			System.out.println("Number is negative: "+num);
		} else {
			System.out.println("Number is positive: "+num);
		}
	}
}

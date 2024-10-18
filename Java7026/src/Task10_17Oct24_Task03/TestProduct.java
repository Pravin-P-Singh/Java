package Task10_17Oct24_Task03;

public class TestProduct {
	public static void main(String[] args) {
		Clothing c1 = new Clothing("Safari",1000,"winter");
		c1.displayProduct();
		c1.calculateDiscount();
		System.out.println("**************************");
		
		Electronics e1 = new Electronics("Washing Machine",10000,2);
		e1.displayProduct();
		e1.calculateDiscount();
	}
}

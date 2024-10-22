package Task12_21OctAbstraction;

import java.util.Scanner;

public class Square extends Shape {
	Scanner sc = new Scanner(System.in);
	@Override
	void calculateArea() {
		System.out.println("Enter the side");
		int side = sc.nextInt();
		int area = side*side;
		System.out.println("Area of square is: "+area);
	}
	@Override
	void drawShape() {
		System.out.println("Square is drawn");
	}
	@Override
	void colorShape() {
		System.out.println("Square is colored green");
	}
}

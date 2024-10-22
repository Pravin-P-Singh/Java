package Task12_21OctAbstraction;

import java.util.Scanner;

public class Rectangle extends Shape {
	Scanner sc = new Scanner(System.in);
	@Override
	void calculateArea() {
		System.out.println("Enter the length and breadth");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int area = length*breadth;
		System.out.println("Area of rectangle is: "+area);
	}
	@Override
	void drawShape() {
		System.out.println("Rectangle is drawn");
	}
	@Override
	void colorShape() {
		System.out.println("Rectangle is colored purple");
	}
}

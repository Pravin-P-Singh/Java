package Task12_21OctAbstractionOptimised;

import java.util.Scanner;

public class Circle extends Shape {
	Scanner sc = new Scanner(System.in);
	@Override
	void calculateArea() {
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
	@Override
	void drawShape() {
		System.out.println("Circle is drawn");
	}
	@Override
	void colorShape() {
		System.out.println("Circle is colored red");
	}
}

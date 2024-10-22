package Task11_18Oct24Polymorphism.Task2;

import java.util.Scanner;

public class Circle extends Shape{
	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float radius = sc.nextFloat();
//		sc.close();
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle is: "+area);
	}	
}

package Task11_18Oct24Polymorphism.Task2;

import java.util.Scanner;

public class Square extends Shape {
	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		int side = sc.nextInt();
		sc.close();
		int area = side*side;
		System.out.println("Area of square is: "+area);
	}
}

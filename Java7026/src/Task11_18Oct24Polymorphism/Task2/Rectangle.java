package Task11_18Oct24Polymorphism.Task2;
import java.util.Scanner;
public class Rectangle {
	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth: ");
		int breadth = sc.nextInt();
		sc.close();
		int area = length * breadth;
		System.out.println("Area of the rectangle is: "+area);
	}
}

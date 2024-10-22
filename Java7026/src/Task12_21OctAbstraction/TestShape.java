package Task12_21OctAbstraction;

public class TestShape {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.greeting();
		c1.calculateArea();
		c1.drawShape();
		c1.colorShape();
		System.out.println("=================");
		Square s1 = new Square();
		s1.greeting();
		s1.calculateArea();
		s1.drawShape();
		s1.colorShape();
		System.out.println("=================");
		
		Rectangle r1 = new Rectangle();
		r1.greeting();
		r1.calculateArea();
		r1.drawShape();
		r1.colorShape();
	}
}

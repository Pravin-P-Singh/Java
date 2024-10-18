package Task10_17Oct24_Task02;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle("circle",4);
		c.displayShape();
		c.calculateArea();
		System.out.println("************************");
		
		Rectangle r = new Rectangle("rectangle",10,10);
		r.displayShape();
		r.calculateArea();
		
	}
}

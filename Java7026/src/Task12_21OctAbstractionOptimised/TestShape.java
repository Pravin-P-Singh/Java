package Task12_21OctAbstractionOptimised;

public class TestShape {
	public static void main(String[] args) {
		TriggerShapeCalling ts = new TriggerShapeCalling();
		
		Circle c1 = new Circle();
		ts.startCalling(c1);
		
		System.out.println("=================");
		
		Square s1 = new Square();
		ts.startCalling(s1);
		
		System.out.println("=================");
		
		Rectangle r1 = new Rectangle();
		ts.startCalling(r1);
	}
}

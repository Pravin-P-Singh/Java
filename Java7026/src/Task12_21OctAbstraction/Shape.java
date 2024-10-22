package Task12_21OctAbstraction;

abstract class Shape {
	abstract void calculateArea();
	abstract void drawShape();
	abstract void colorShape();
	void greeting() {
		System.out.println("Welcome to shape family...");
	}
}

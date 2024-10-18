package Task10_17Oct24_Task02;

public class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle(){
		
	}
	Rectangle(String name, double length, double breadth){
		super(name);
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		double Area = length*breadth;
		System.out.println("Area of "+name+" is: "+Area);
	}
	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", length=" + length + ", breadth=" + breadth + "]";
	}
	
	
}

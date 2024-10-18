package Task10_17Oct24_Task02;

public class Circle extends Shape{
	double radius;
	Circle(){
		
	}
	Circle(String name,double radius){
		super(name);
		this.radius = radius;
	}
	public void calculateArea() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of "+name+" is "+area);
	}
	@Override
	public String toString() {
		return "Circle [name=" + name + ", radius=" + radius + "]";
	}
	
	
}

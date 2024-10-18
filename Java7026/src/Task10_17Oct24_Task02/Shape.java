package Task10_17Oct24_Task02;

public class Shape {
	String name;
	
	Shape(){
		
	}
	Shape(String name){
		this.name = name;
	}
	public void displayShape() {
		System.out.println("The shape is a "+name);
	}
	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
}

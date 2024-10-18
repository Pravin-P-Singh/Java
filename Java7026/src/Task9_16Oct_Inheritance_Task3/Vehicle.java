package Task9_16Oct_Inheritance_Task3;

public class Vehicle {
	String brand;
	String model;
	String year;
	
	Vehicle(){
		
	}
	Vehicle(String brand, String model, String year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public void start(String name) {
		System.out.println(name+ " has started");
	}
	public void stop(String name) {
		System.out.println(name+" has stopped");
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}
	
}

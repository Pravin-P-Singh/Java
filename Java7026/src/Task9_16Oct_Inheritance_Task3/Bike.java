package Task9_16Oct_Inheritance_Task3;

public class Bike extends Vehicle {
	int engineCC;
	String typeOfHandleBar;
	boolean hasGear;
	Bike(){
		
	}
	Bike(String brand, String model,String year, int engineCC,String typeOfHandleBar,boolean hasGear){
		super(brand,model,year);
		this.engineCC = engineCC;
		this.typeOfHandleBar = typeOfHandleBar;
		this.hasGear = hasGear;
	}
	public void kickStart() {
		System.out.println("The bike is started using kick");
	}
	public void applyBrakes() {
		System.out.println("The bike has applied breaks");
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", model=" + model + ", year=" + year + ", engineCC=" + engineCC
				+ ", typeOfHandleBar=" + typeOfHandleBar + ", hasGear=" + hasGear + "]";
	}
	
}

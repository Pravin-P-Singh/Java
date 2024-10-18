package Task9_16Oct_Inheritance_Task3;

public class Truck extends Vehicle{
	int loadCapacity;
	int numberOfWheels;
	String cargoType;
	
	Truck(){
		
	}
	Truck(String brand, String model, String year,int loadCapacity,int numberOfWheels,String cargoType){
		super(brand,model,year);
		this.loadCapacity = loadCapacity;
		this.numberOfWheels = numberOfWheels;
		this.cargoType = cargoType;
	}
	public void loadCargo() {
		System.out.println("Cargo has been loaded on truck");

	}
	public void unloadCargo() {
		System.out.println("Cargo has been unloaded from the truck");
	}
	@Override
	public String toString() {
		return "Truck [brand=" + brand + ", model=" + model + ", year=" + year + ", loadCapacity=" + loadCapacity
				+ ", numberOfWheels=" + numberOfWheels + ", cargoType=" + cargoType + "]";
	}
	
}

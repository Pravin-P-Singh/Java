package Task9_16Oct_Inheritance_Task3;

public class Car extends Vehicle {
	int numberOfDoors;
	String fuelType;
	int trunkSize;
	
	Car(){
		
	}
	Car(String brand,String model,String year ,int numberOfDoors, String fuelType, int trunkSize){
		super(brand,model,year);
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
		this.trunkSize = trunkSize;
	}
	public void playMusic() {
		System.out.println("Music is playing inside car");
	}
	public void openSunroof() {
		System.out.println("Car's sunroof has been opened");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", numberOfDoors=" + numberOfDoors
				+ ", fuelType=" + fuelType + ", trunkSize=" + trunkSize + "]";
	}
	
	
}

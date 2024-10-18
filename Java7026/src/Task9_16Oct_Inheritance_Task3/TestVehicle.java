package Task9_16Oct_Inheritance_Task3;

public class TestVehicle {
	public static void main(String[] args) {
		Bike b = new Bike("Bajaj","Super123","2009",1000,"Rubber",true);
		b.kickStart();
		b.start(b.model);
		b.applyBrakes();
		b.stop(b.model);
		System.out.println(b);
		System.out.println("**************************");
		
		Car c = new Car("Maruti","M111","2012",4,"Diesel",10);
		c.start(c.model);
		c.playMusic();
		c.openSunroof();
		c.stop(c.model);
		System.out.println(c);
		System.out.println("**************************");

		Truck t = new Truck("Volvo","V10","2022",20,1000,"Arms and Ammunitions");
		t.loadCargo();
		t.start(t.model);
		t.unloadCargo();
		t.stop(t.model);
		System.out.println(t);
	}
}

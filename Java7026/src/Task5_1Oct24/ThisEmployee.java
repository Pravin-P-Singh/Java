package Task5_1Oct24;

public class ThisEmployee {
	int id;
	String name;
	
	void accept(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("\nEmployee id: "+id+"\nEmployee name: "+name);
	}
}

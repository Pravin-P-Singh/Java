package Task5_1Oct24;

public class ThisStudent {
	int id;
	String name;
	
	void accept(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("\nStudent id: "+id+"\nStudent name: "+name);
	}
}

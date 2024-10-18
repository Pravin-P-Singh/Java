package Task5_1Oct24;

public class Student {
	int id;
	String name;
	String course;
	float percentage;
	void accept(int a, String b,String c, float d) {
		id = a;
		name = b;
		course = c;
		percentage = d;
	}
	void display() {
		System.out.println("\nid : "+ id+"\n name: "+name+"\n course : "+ course +"\n percentage: "+percentage);
	}
}

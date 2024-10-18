package Task8_15Oct24_Inheritance;

public class Student extends Person {
	String course;
	float per;
	public Student(int id, String name, int age,String course, float per){
		super(id,name,age);
		this.course = course;
		this.per = per;
	}
	void display() {
		System.out.println("Student Details:");
		System.out.println("\nId: "+id+"\nName: "+name+"\nAge: "+age+"\nCourse: "+course+"\nPercentage: "+per);
		System.out.println("***************************************");
	}
}

package Task8_15Oct24_Inheritance;

public class Employee extends Person {
	String designation;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name,int age,String designation,double salary ) {
		super(id,name,age);
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
}

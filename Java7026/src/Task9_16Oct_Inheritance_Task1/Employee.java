package Task9_16Oct_Inheritance_Task1;

public class Employee {
	String name;
	int employeeId;
	String department;
	
	Employee(){
		
	}
	
	Employee(String name,int employeeId, String department){
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
	}
	
	public void work() {
		System.out.println("I am working");
	}
	public void takeBreak() {
		System.out.println("I have taken a break");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + "]";
	}
	
	
}

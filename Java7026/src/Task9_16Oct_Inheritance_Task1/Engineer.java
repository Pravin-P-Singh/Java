package Task9_16Oct_Inheritance_Task1;

public class Engineer extends Employee {
	String specialization;
	int experienceOverYears;
	String currentProject;
	
	Engineer(){
		
	}
	Engineer(String name,int employeeId,String department,String specialization,int experienceOverYears,String currentProject){
		super(name,employeeId,department);
		this.specialization = specialization;
		this.experienceOverYears = experienceOverYears;
		this.currentProject = currentProject;
	}
	public void developSoftware() {
		System.out.println("I am developing software: "+currentProject);
	}
	public void fixBugs() {
		System.out.println("I am fixing the bugs on project: "+currentProject);
	}
	@Override
	public String toString() {
		return "Engineer [name=" + name + ", employeeId=" + employeeId + ", department=" + department
				+ ", specialization=" + specialization + ", experienceOverYears=" + experienceOverYears
				+ ", currentProject=" + currentProject + "]";
	}
}

package Task9_16Oct_Inheritance_Task1;

public class Manager extends Employee {
	int teamSize;
	String project;
	String officeLocation;
	
	Manager(){
		
	}
	Manager(String name, int employeeId,String department,int teamSize, String project,String officeLocation){
		super(name,employeeId,department);
		this.teamSize = teamSize;
		this.project = project;
		this.officeLocation = officeLocation;
	}
	public void conductMeeting() {
		System.out.println("I am conducting a meet on project: "+project);
	}
	public void assignTasks(String team) {
		System.out.println("I am assigning tasks to team: "+team);
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", employeeId=" + employeeId + ", department=" + department + ", teamSize="
				+ teamSize + ", project=" + project + ", officeLocation=" + officeLocation + "]";
	}
	
	
}

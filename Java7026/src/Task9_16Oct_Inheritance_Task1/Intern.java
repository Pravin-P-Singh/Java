package Task9_16Oct_Inheritance_Task1;

public class Intern extends Employee {
	String collegeName;
	int durationOfInternship;
	String mentor;
	
	Intern(){
		
	}
	Intern(String name, int employeeId, String department,String collegeName,int durationOfInternship,String mentor){
		super(name,employeeId,department);
		this.collegeName = collegeName;
		this.durationOfInternship = durationOfInternship;
		this.mentor = mentor;
	}
	
	public void learnNewSkills(String skill) {
		System.out.println("I am learning a new skill: "+skill+" on my internship ");
	}
	public void submitReports() {
		System.out.println("I am submitting reports to the Manager of Department:"+department);
	}
	@Override
	public String toString() {
		return "Intern [name=" + name + ", employeeId=" + employeeId + ", department=" + department + ", collegeName="
				+ collegeName + ", durationOfInternship=" + durationOfInternship + ", mentor=" + mentor + "]";
	}
	
}

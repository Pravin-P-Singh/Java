package Task9_16Oct_Inheritance_Task1;

public class TestEmployee {
	public static void main(String[] args) {
		Manager m1 = new Manager("Sanjay",101,"Messaging Applications",10,"Whatsapp","Malad");
		System.out.println(m1);
		m1.conductMeeting();
		m1.assignTasks("Testing");
		m1.takeBreak();
		System.out.println("***********************************************");

		Engineer e1 = new Engineer("Pravin",1001,"Development","Java Developer",3,"Banking Application");
		System.out.println(e1);
		e1.work();
		e1.developSoftware();
		e1.fixBugs();
		System.out.println("***********************************************");
		Intern i1 = new Intern("Shubham",10001,"Messaging Application","LTCE",3,"Sanjay");
		System.out.println(i1);
		i1.learnNewSkills("Java");
		i1.work();
		i1.submitReports();
	}
}

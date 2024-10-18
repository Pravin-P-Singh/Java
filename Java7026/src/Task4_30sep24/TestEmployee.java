package Task4_30sep24;

public class TestEmployee {
	public static void main(String[] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		E1.Employeeid = 1;
		E1.EmployeeName="Raghav";
		E1.EmployeeAge = 28;
		E1.EmployeeSalary = 4900000.737;
		E1.EmployeeProfession="Data Scientist";
		E1.Work();
		
		E2.Employeeid = 2;
		E2.EmployeeName="Shyam";
		E2.EmployeeAge = 29;
		E2.EmployeeSalary=5900000.832;
		E2.EmployeeProfession = "Java Developer";
		E2.Work();
	}
}

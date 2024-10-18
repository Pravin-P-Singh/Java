package Task7_14Oct24_Encapsulation;

public class Test {
	public static void main(String[] args) {
		Account a1 = new Account(10001,"Pravin",900000.99);
		Account a2 = new Account(10002,"Roneet",123456.78);
		a1.display();
//		a1.balance = a1.balance*-1; not allowed to directly access a member private to class
		a1.setBalance(3000000); //this works
		a1.display();
		
//		a2.name = "Shubham"; //invalid to change the name directly
		a2.display();
		a2.setName("Shubham");
		a2.display();
		
	}
}

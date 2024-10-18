package Task10_17Oct24;

public class TestAccount {
	public static void main(String[] args) {
		CurrentAccount CA1 = new CurrentAccount(10001,"Pravin",10000);
		System.out.println(CA1);
		CA1.withdraw(6000);
		CA1.deposit(4000);
		CA1.withdraw(6000);
		System.out.println(CA1);
		System.out.println("****************************************");
		
		SavingAccount SA1 = new SavingAccount(10002,"Rahul",5000);
		System.out.println(SA1);
		SA1.withdraw(2000);
		SA1.deposit(1000);
		System.out.println(SA1);
		System.out.println("****************************************");
		
		SalaryAccount Sal1 = new SalaryAccount(10003,"Shubham",10000);
		System.out.println(Sal1);
		Sal1.withdraw(1000);
		Sal1.deposit(2000);
		System.out.println("****************************************");
	}
}

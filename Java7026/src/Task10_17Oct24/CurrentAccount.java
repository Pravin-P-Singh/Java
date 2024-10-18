package Task10_17Oct24;


public class CurrentAccount extends Account {
	double currentMinBalance = 5000;
	CurrentAccount(){
		
	}
	CurrentAccount(int accNo, String name, double balance){
		super(accNo,name,balance);
		
	}
	public void withdraw(double amount) {
		if(balance > amount && balance - amount >= currentMinBalance) {
			System.out.println("Succesfully withrawed "+amount);
			balance-=amount;
			System.out.println("Current Balance: "+balance);
		} else {
			System.out.println("Insufficient current minimum balance");
			System.out.println("Current Balance: "+balance);
		}
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [currentMinBalance=" + currentMinBalance + ", accNo=" + accNo + ", name=" + name
				+ ", balance=" + balance + "]";
	}
	public void deposit(double amount) {
		System.out.println("Succesfully deposited "+amount);
		balance += amount;
		System.out.println("Current Balance: "+balance);
	}
}

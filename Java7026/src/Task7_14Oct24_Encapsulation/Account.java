package Task7_14Oct24_Encapsulation;

public class Account {
	private int AccountNo;
	private double balance;
	private String name;
	
	Account(){
		
	}
	Account(int AccountNo, String name, double balance){
		this.AccountNo = AccountNo;
		this.name = name;
		this.balance = balance;
	}
	//to change the name inside the class
	public void setName(String name) {
		this.name = name;
	}
	//to get the name 
	public String getName() {
		return this.name;
	}
	
	//to set the accountNumber
	public void setAccountNumber(int AccountNo) {
		this.AccountNo = AccountNo;
	}
	//to get the accountNumber
	public int getAccountNumber() {
		return this.AccountNo;
	}
	
	//to change the balance but inside the class itself
	public void setBalance(double amount) {
		if(amount > 0) {
			this.balance = amount;
		} else {
			System.out.println("Amount can't be negative");
		}
	}
	//to get the balance
	public double getBalance() {
		return this.balance;
	}
	
	//to display customer details
	public void display() {
		System.out.println("Name: "+this.name+"\nAccount No: "+this.AccountNo+"\nBalance: "+this.balance);
		System.out.println("***************************************************************************");
	}
	
	
}

package Task10_17Oct24;

public class Account {
	int accNo;
	String name;
	double balance;
	
	Account(){
		
	}
	Account(int accNo, String name,double balance){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

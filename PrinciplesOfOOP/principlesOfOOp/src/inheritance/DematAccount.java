package inheritance;

public class DematAccount extends BankAccount{
	String type;
	String id;
	double balance;
	double holdings;
	double brokerage;
	
	DematAccount(){}
	
	DematAccount(String bankName,String IFSC, String branch,long phno,long aadhar,long accno,String name,String type,String id,double balance,double holdings,double brokerage)
	{
		this.bankName = bankName;
		this.IFSC = IFSC;
		this.branch = branch;
		this.phno = phno;
		this.aadhar = aadhar;
		this.accno = accno;
		this.name = name;
		
		this.type = type;
		this.id = id;
		this.balance = balance;
		this.holdings = holdings;
		this.brokerage = brokerage;
	}
	
	public void displayDematAccount()
	{
		displayBankAccount();
		System.out.println("Type: "+type);
		System.out.println("ID: "+id);
		System.out.println("Balance: "+balance);
		System.out.println("Holdings: "+holdings);
		System.out.println("Brokerage: "+brokerage);
	}
}

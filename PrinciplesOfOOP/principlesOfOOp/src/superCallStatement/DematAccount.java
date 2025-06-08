package superCallStatement;

public class DematAccount extends BankAccount {
	String type;
	double balance;
	double holdings;
	String id;
	double brokerage;
	
	DematAccount(){}
	
	DematAccount(String bankName,long accno,String name,String ifsc,String branch,long phno,long aadhar,String type,double balance,double holdings,String id,double brokerage)
	{
		super(bankName,accno,name,ifsc,branch,phno,aadhar);
		
		this.type = type;
		this.balance = balance;
		this.holdings = holdings;
		this.id = id;
		this.brokerage = brokerage;
	}
	
	public void displayDematAccount()
	{
		displayBankAccount();
		
		System.out.println("Type: "+type);
		System.out.println("Balance: "+balance);
		System.out.println("Holdings: "+holdings);
		System.out.println("ID: "+id);
		System.out.println("Brokerage: "+brokerage);
	}
}

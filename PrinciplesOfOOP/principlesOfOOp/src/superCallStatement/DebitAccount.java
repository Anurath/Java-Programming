package superCallStatement;

public class DebitAccount extends BankAccount {
	String type;
	double balance;
	double intRate;
	
	DebitAccount(){}
	
	DebitAccount(String bankName,long accno,String name,String ifsc,String branch,long phno,long aadhar,String type,double balance,double intRate)
	{
		super(bankName,accno,name,ifsc,branch,phno,aadhar);
		
		this.type = type;
		this.balance = balance;
		this.intRate = intRate;
	}
	
	public void displayDebitAccount()
	{
		displayBankAccount();
		System.out.println("Type: "+type);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+intRate);
	}
}

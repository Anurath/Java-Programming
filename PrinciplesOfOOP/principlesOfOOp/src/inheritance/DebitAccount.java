package inheritance;

public class DebitAccount extends BankAccount {
	String type;
	double balance;
	double interestRate;
	
	DebitAccount(){}
	
	DebitAccount(String bankName,String IFSC, String branch,long phno,long aadhar,long accno,String name,String type,double balance,double interestRate)
	{
		this.bankName = bankName;
		this.IFSC = IFSC;
		this.branch = branch;
		this.phno = phno;
		this.aadhar = aadhar;
		this.accno = accno;
		this.name = name;
		
		this.type = type;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void displayDebitAccount()
	{
		displayBankAccount();
		System.out.println("Type: "+type);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
	}
}

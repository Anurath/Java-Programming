package superCallStatement;

public class BankAccount {
	String bankName;
	long accno;
	String name;
	String ifsc;
	String branch;
	long phno;
	long aadhar;
	
	BankAccount(){}
	
	BankAccount(String bankName,long accno,String name,String ifsc,String branch,long phno,long aadhar)
	{
		this.bankName = bankName;
		this.accno = accno;
		this.name =name;
		this.ifsc = ifsc;
		this.branch = branch;
		this.phno = phno;
		this.aadhar = aadhar;
	}
	public void displayBankAccount()
	{
		System.out.println("Bank Name: "+bankName);
		System.out.println("Bank Account Numner: "+accno);
		System.out.println("Account Holder Name: "+name);
		System.out.println("Bank IFSC: "+ifsc);
		System.out.println("Branch: "+branch);
		System.out.println("Phone Number: "+phno);
		System.out.println("Aadhar Number: "+aadhar);
	}
}

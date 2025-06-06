package inheritance;

public class BankAccount {
	String bankName;
	String IFSC;
	String branch;
	String name;
	long accno;
	long phno;
	long aadhar;
	
	BankAccount(){}
	
	BankAccount(String bankName,String IFSC, String branch,long phno,long aadhar,long accno,String name)
	{
		this.bankName = bankName;
		this.IFSC = IFSC;
		this.branch = branch;
		this.phno = phno;
		this.aadhar = aadhar;
		this.accno = accno;
		this.name = name;
	}
	
	public void displayBankAccount()
	{
		System.out.println("Bank Name: "+bankName);
		System.out.println("IFSC: "+IFSC);
		System.out.println("Branch: "+branch);
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+accno);
		System.out.println("Phone Number: "+phno);
		System.out.println("Aadhar Number: "+aadhar);
	}
}

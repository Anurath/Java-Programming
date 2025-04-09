package encapsulationPackage;

public class Bank {
	private String userName;
	private String bankName;
	private String IFSC;
	private double balance;
	private double accno;
	private int pin;
	
	Bank(String userName,String bankName,String IFSC,double balance,double accno, int pin)
	{
		this.userName = userName;
		this.bankName = bankName;
		this.IFSC = IFSC;
		this.balance = balance;
		this.accno = accno;
		this.pin = pin;
	}
	
	public String getUsername()
	{
		return userName;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void checkBalance(double accno,int pin)
	{
		if(accno == this.accno && pin == this.pin)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public String showIFSC(double accno ,int pin)
	{
		return IFSC;
	}
	
	public void credit(double accno , int pin , double amt)
	{
		if(accno == this.accno && pin == this.pin)
		{
			if(amt>0)
			{
				balance+=amt;
				System.out.println(balance);
				System.out.println("Amount Credited!");
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void debit(double accno , int pin , double amt)
	{
		if(accno == this.accno && pin == this.pin)
		{
			if((balance-=amt)>500)
			{
				if(amt>0)
				{
					balance-=amt;
					System.out.println(balance);
					System.out.println("Amount Debeted");
				}
				else
				{
					System.out.println("Invalid Amount");
				}
			}
			else {
				System.out.println("Insufficient Funds");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void setPin(double accno , int oldPin , int newPin)
	{
		if(accno == this.accno && oldPin == this.pin)
		{
			pin = newPin;
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
}

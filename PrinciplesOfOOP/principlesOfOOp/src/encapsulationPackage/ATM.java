package encapsulationPackage;

public class ATM {
	private String userName;
	private long accno;
	private int pin;
	private long phno;
	private double balance;
	
	ATM(String userName,long accno,int pin, long phno,double balance)
	{
		this.userName = userName;
		this.accno = accno;
		this.pin  = pin;
		this.phno = phno;
		this.balance = balance;
	}
	
	public void debit(long accno,int pin,double amt)
	{
		if(this.accno == accno && this.pin == pin)
		{
			if(amt>0)
			{
					if((balance-amt)>500) {
						balance-=amt;
						System.out.println("Debeted Amount: "+amt);
						System.out.println("Current Balance: "+balance);
						System.out.println("Amount Debited.");
					}
					else
					{
						System.out.println("Insufficient Funds");
					}
			}
			else {
				System.out.println("Invalid Amount!");
			}
		}
		else
		{
			System.out.println("Invalid Credentials!");
		}
	}
	
	public void setPin(long accno,int oldPin,int newPin)
	{
		if(this.accno == accno && oldPin == pin)
		{
			pin =newPin;
			System.out.println("Pin changed!");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
}

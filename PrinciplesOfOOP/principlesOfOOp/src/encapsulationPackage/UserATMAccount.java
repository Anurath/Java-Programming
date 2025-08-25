package encapsulationPackage;
import java.util.*;
public class UserATMAccount {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String dob;
	private int pin;
	private long phno;
	private long aadhar;
	private long accno;
	private String ifsc;
	private long telno;
	private String email;
	
	public UserATMAccount(String name,String dob,int pin,long phno,long aadhar,long accno,String ifsc)
	{
		this.name = name;
		this.dob = dob;
		this.pin = pin;
		this.phno = phno;
		this.aadhar = aadhar;
		this.accno = accno;
		this.ifsc = ifsc;
	}
	
	public UserATMAccount(String name,String dob,int pin,long phno,long aadhar,long accno,String ifsc,long telno)
	{
		this(name,dob,pin,phno,aadhar,accno,ifsc);
		this.telno = telno;
	}
	
	public UserATMAccount(String name,String dob,int pin,long phno,long aadhar,long accno,String ifsc,long telno,String email)
	{
		this(name,dob,pin,phno,aadhar,accno,ifsc,telno);
		this.email = email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				this.name = name;
				System.out.println("User's Name has been changed");
				return;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
	}
	
	public void setPin(int newPin)
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				this.pin = newPin;
				System.out.println("User's PIN has been changed");
				return;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
	}
	
	public long getPhno()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return phno;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return 0;
	}
	
	public void setPhno(long newPhno)
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				this.phno = newPhno;
				System.out.println("Phone number changed!");
				return;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
	}
	
	public long getAadhar()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return aadhar;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return 0;
	}
	public long getAccno()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return accno;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return 0;
	}
	
	public String getIfsc()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return ifsc;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return null;
	}
	
	public long getTelno()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return telno;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return 0;
	}
	
	public void setTelno(long newTelno)
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				this.phno = newTelno;
				System.out.println("Telephone number changed!");
				return;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
	}
	
	
	public String getEmail()
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				return email;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
		return null;
	}
	
	public void setEmail(String newEmail)
	{
		int i=3;
		do {
			System.out.print("Enter the pin: ");
			pin = sc.nextInt();
			if(this.pin == pin)
			{
				this.email = newEmail;
				System.out.println("Phone number changed!");
				return;
			}
			else {
				System.out.println("Wrong PIN Attempts left "+i);
				i--;
			}
		}while(i>0);
		System.out.println("Your account locked for 3 days :-(");
		System.exit(0);
	}
}

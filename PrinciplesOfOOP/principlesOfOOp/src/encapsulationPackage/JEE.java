package encapsulationPackage;

public class JEE {
	private String name;
	private String email;
	private String  password;
	private long phno;
	private double marks;
	private int rank;
	
	JEE(){}
	JEE(String name,String email,String password,long phno,double marks,int rank)
	{
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.marks = marks;
		this.rank = rank;
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String password,String newEmail)
	{
		if(password==this.password)
		{
			email = newEmail;
			System.out.println("Email Updated!");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	public long getPhone() {
		return phno;
	}
	
	public void setPhone(String password,String email,long newPhone)
	{
		if(password==this.password && this.email == email)
		{
			phno = newPhone;
			System.out.println("Phone Number Updated!");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	
	public void setPassword(String email, String oldPassword,String newPassword)
	{
		if(this.email == email && this.password==oldPassword)
		{
			password = newPassword;
			System.out.println("Passward Updated");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	
	public double getMarks()
	{
		return marks;
	}
	
	public int getRank()
	{
		return rank;
	}
	
}

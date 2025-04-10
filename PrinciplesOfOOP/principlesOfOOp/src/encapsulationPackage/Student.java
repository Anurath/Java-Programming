package encapsulationPackage;

public class Student {
	private String name;
	private String coll;
	private int PRN;
	private String email;
	private long phno;
	private String password;
	
	Student(String name , String coll, int PRN, String email,long phno,String password)
	{
		this.name = name;
		this.coll = coll;
		this.PRN = PRN;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}
	
	public String getStudent()
	{
		return name;
	}
	
	public String getCollage()
	{
		return coll;
	}
	
	public long getPRN()
	{
		return PRN;
	}
	
	public void setPassword(String email, long phno,String password,String newPassword)
	{
		if(this.email == email && this.phno == phno)
		{
			if(password == this.password)
			{
				password = newPassword;
				System.out.println("Password Number Changed!");
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalud Credentials");
		}
	}
	public void setPassword(String email,String password, long phno,long newPhno)
	{
		if(this.email == email && this.password == password)
		{
			phno = newPhno;
			System.out.println("Phone Number Changed!");
		}
		else
		{
			System.out.println("Invalud Credentials");
		}
	}
}

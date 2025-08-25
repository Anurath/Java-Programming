package practiceArea;

public class Form {

	String name;
	String dob;
	int age;
	String email;
	String college;
	long phno;
	long telno;
	
	public Form(String name,String dob,int age,long phno)
	{
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.phno = phno;
	}
	
	public Form(String name,String dob,int age,long phno,String email)
	{
		this(name,dob,age,phno);
		this.email = email;
	}
	
	public Form(String name,String dob,int age,long phno,String email,String college)
	{
		this(name,dob,age,phno,email);
		this.college = college;
	}
	
	public Form(String name,String dob,int age,long phno,String email,String college,long telno)
	{
		this(name, dob, age, phno,email,college);
		this.telno = telno;
	}
	
	public void displayForm()
	{
		System.out.println(name);
		System.out.println(dob);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(email);
		System.out.println(college);
		System.out.println(telno);
	}
}

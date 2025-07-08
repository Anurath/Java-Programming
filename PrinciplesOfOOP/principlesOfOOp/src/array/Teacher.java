package array;

public class Teacher {

	String name;
	String clg;
	int age;
	String subject;
	long phno;
	
	Teacher(){}
	
	Teacher(String name,String clg,int age,String subject,long phno)
	{
		this.name = name;
		this.clg  = clg;
		this.age = age;
		this.subject = subject;
		this.phno = phno;
	}
	
	public String toString()
	{
		return "[Name: "+name+", Collage: "+clg+", Subject: "+subject+", Age: "+age+", Phone Number: "+phno;
	}
}

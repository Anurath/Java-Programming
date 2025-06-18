package objectClass;

public class Teacher {
	String name;
	int age;
	String subject;
	String education;
	int exp;
	
	Teacher(){}
	
	Teacher(String name, int age, String subject,String education,int exp)
	{
		this.name = name;
		this.age = age;
		this.subject =subject;
		this.education = education;
		this.exp = exp;
	}
	
	public boolean equals(Object o)
	{
		Teacher t3 = (Teacher)o;
		
		if(this.name==t3.name && this.age == t3.age && this.subject == t3.subject && this.education == t3.education && this.exp == t3.exp)
		{
			return true;
		}
		else
			return false;
	}
}

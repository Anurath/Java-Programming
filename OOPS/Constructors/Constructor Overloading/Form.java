class Form
{
	String name;
	long phno;
	String dob;
	char gen;
	String email;
	String blood;
	long tel;
	Form()
	{
		
	}
	Form(String name,long phno,String dob,char gen)
	{
		System.out.println("From Constructor 1");
		this.name=name;
		this.phno=phno;
		this.dob=dob;
		this.gen=gen;
	}
	Form(String name ,long phno , String dob, char gen,String email)
	{
		System.out.println("From Constructor 2");
		this.name=name;
		this.phno=phno;
		this.dob=dob;
		this.gen=gen;

		this.email=email;
	}
	Form(String name ,long phno, String dob,char gen,String email,String blood)
	{
		System.out.println("From Constructor 3");
		this.name=name;
		this.phno=phno;
		this.dob=dob;
		this.gen=gen;

		this.email=email;
		this.blood=blood;
	}
	Form(String name,long phno,String dob,char gen,String email,String blood,long tel)
	{
		System.out.println("From Constructor 4");
		this.name=name;
		this.phno=phno;
		this.dob=dob;
		this.gen=gen;

		this.email=email;
		this.blood=blood;
		this.tel=tel;
	}
	public void displayForm()
	{
		System.out.println(name);
		System.out.println(phno);
		System.out.println(dob);
		System.out.println(gen);
		System.out.println(email);
		System.out.println(blood);
		System.out.println(tel);
	}
}
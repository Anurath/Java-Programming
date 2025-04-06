class Form
{
	String name;
	long phno;
	String dob;
	char gen;
	String blood;
	long tel;
	String email;
	Form(){}
	Form(String name,long phno, String dob,char gen)
	{
		System.out.println("From constructor 1");
		this.name=name;
		this.phno=phno;
		this.dob=dob;
		this.gen=gen;
	}
	Form(String name,long phno,String dob,char gen,String blood)
	{
		this(name,phno,dob,gen);
		System.out.println("From constructor 2");
				
		this.blood=blood;
	}
	Form(String name, long phno,String dob,char gen,String blood,long tel)
	{
		this(name,phno,dob,gen,blood);
		System.out.println("From constructor 3");
		this.tel=tel;
	}
	Form(String name,long phno ,String dob,char gen, String blood,long tel,String email)
	{
		this(name,phno,dob,gen,blood,tel);
		System.out.println("From constructor 4");
		this.email=email;
	}
	public void displayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone No: "+phno);
		System.out.println("DOB: "+dob);
		System.out.println("Gender: "+gen);
		System.out.println("Blood: "+blood);
		System.out.println("Tel: "+tel);
		System.out.println("Email: "+email);
	}
}
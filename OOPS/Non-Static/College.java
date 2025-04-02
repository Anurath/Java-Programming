class College
{
	String name;
	int year;
	String address;
	int student;
	{
		System.out.println("Object initiated");
	}
	public College displayName()
	{
		System.out.println("Name of college: "+name);
		return this;
	}
	public College displayYear()
	{
		System.out.println("Istablish Year: "+year);
		return this;
	}
	public College displayStudent()
	{
		System.out.println("Number of Students: "+student);
		return this;
	}
	public College displayAddress()
	{
		System.out.println("Address: "+address);
		return this;
	}
}
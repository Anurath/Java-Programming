class Student
{
	String name;
	String coll;
	int roll;
	String gender;
	{
		System.out.println("Non static block starts");
		displayStudent();
	}
	public Student(String name, String coll,int roll,String gender)
	{
		System.out.println("Constructor starts");
		this.name=name;
		this.coll=coll;
		this.roll=roll;
		this.gender=gender;
	}
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(coll);
		System.out.println(roll);
		System.out.println(gender);
	}
}
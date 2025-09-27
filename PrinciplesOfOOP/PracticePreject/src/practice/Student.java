package practice;

public class Student implements Comparable<Student> {

	int sid;
	String name;
	int age;
	String college;
	int yop;
	
	public Student(int sid , String name, int age, String college, int yop)
	{
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.college = college;
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", college=" + college + ", yop=" + yop
				+ "]";
	}
	
	public int compareTo(Student obj)
	{
		return this.name.compareTo(obj.name);
	}
	
	public boolean equals(Object obj)
	{
		Student s = (Student)obj;
		
		if(this.name.endsWith(obj.toString()))
			return true;
		return false;
	}
	
}

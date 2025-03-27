class StudentDriver
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="Ram";
		s1.age=22;
		s1.score=8.98;
		s1.course="Computer";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.score);
		System.out.println(s1.course);
		System.out.println("_____________________________");

		Student s2=new Student();
		s2.name="Lakhan";
		s2.age=23;
		s2.score=9.08;
		s2.course="IT";
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.score);
		System.out.println(s2.course);
	}
}
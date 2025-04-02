class CollegeDriver
{
	public static void main(String[] args)
	{
		College c1 = new College();
		c1.name="B.K.Vidyalaya Pathrud";
		c1.year=1954;
		c1.address="Pathrud";
		c1.student=1000;
		c1.displayName().displayYear().displayAddress().displayStudent();
		System.out.println("");
		College c2 = new College();
		c2.name="Maharashtra College Barshi";
		c2.year=1954;
		c2.address="Barshi";
		c2.student=2000;
		c2.displayName().displayYear().displayAddress().displayStudent();
	}
}
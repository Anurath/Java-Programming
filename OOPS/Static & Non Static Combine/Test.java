class Test
{
	static int a=10;
	int b;

	{
		System.out.println("From non static block 1");
	}
	static
	{
		demoStaticMethod();
		System.out.println("From static block 1");
	}
	{
		System.out.println("From non static block 2");
	}
	
	public static void demoStaticMethod()
	{
		System.out.println(a);	
	}
	public void demoNonStaticMethod()
	{
		System.out.println(b);
	}

	Test()
	{
		System.out.println("Constructor starts");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		Test t1 = new Test();
		t1.demoNonStaticMethod();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
	}
}
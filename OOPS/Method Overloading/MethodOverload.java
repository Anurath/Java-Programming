class MethodOverload
{
	public static void main(String[] args)
	{
		add(12,2);
		add(12.0,2);
		add('a','b');
		add("Anurath ","Waghmode");
	}
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void add(double x,double y)
	{
		System.out.println(x+y);
	}
	public static void add(char a,char b)
	{
		System.out.println(a+b);
	}
	public static void add(String a,String b)
	{
		System.out.println(a+b);
	}
}
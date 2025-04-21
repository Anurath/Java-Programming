class MethodOverloading1
{
	public static void main(String[] args)
	{
		System.out.println(div(10.5,3.4));
	}
	public static int div(int n1,int n2)
	{
		return n1/n2;
	}
	public static double div(double n1,double n2)
	{
		return n1/n2;
	}
	public static double div(int n1,double n2)
	{
		return n1/n2;
	}
	public static double div(double n1,int n2)
	{
		return n1/n2;
	}
}


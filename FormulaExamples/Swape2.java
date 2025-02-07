class Swape2
{
	public static void main(String[] args)
	{
		int a=3;
		int b=5;

		System.out.println("BEFORE SWAPPING");
		System.out.println(a);
		System.out.println(b);
		a=(a+b)-b;
		b=(a+b)-a;
		System.out.println("AFTER SWAPPING");
		System.out.println("a" +a);
		System.out.println("b" +b);

	}
}
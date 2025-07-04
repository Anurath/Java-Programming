package wrapperClass;

public class Test {
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 10;
		
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i1.equals(i2));
	}
}

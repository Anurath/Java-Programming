package wrapperClass;

public class Demo {

	int a = 10;
	
	byte b = 20;
	
	char ch = 'a';
	
	long l = 20;
	
	double d = 20;
	
	boolean flag = false;
	
	
	public static void main(String[] args)
	{
		int n1 = 10;
		Integer i1 = new Integer(n1);
		
		Integer i2 = new Integer(n1);
		
		System.out.println(i1==i2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		
	}
}

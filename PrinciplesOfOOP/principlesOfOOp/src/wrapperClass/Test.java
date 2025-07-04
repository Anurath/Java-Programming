package wrapperClass;

public class Test {
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 10;
		
		char ch1 = 'a';
		char ch2 = 'a';
		
		long num1 = 10;
		long num2 = 10;
		
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		
		System.out.println(i1.toString()); // toString() used to print the reference but here attribute is printed
		System.out.println(i2.toString()); // toString() used to print the reference but here attribute is printed
		
		System.out.println(i1.equals(i2));
		
		System.out.println("--------------------------------");
		
		Character c1 = new Character(ch1);
		Character c2 = new Character(ch2);
		System.out.println(ch1 == ch2);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("----------------------------------");
		
		Long l1 = new Long(num1);
		Long l2 = new Long(num2);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l1 == l2);
	}
}

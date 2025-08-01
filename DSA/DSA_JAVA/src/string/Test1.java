package string;

public class Test1 {

	public static void main(String[] args)
	{
		String s1 = new String("Hi");
		
		String s2 = new String("Hi");
		
		String s3 = "Hi";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}

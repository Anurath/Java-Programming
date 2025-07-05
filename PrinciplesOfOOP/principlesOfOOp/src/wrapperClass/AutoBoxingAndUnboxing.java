package wrapperClass;

public class AutoBoxingAndUnboxing {
	
	public static void main(String[] args)
	{
		Integer i1 = 100;  //Auto-boxing
		int num1 = i1;	//Auto-unboxing
		System.out.println(num1);
		
		Character c1 = 'a';  //Auto-boxing
		char ch = c1;  //Auto-unboxing
		System.out.println(ch);
		
		Long l1 = 12334l;  //Auto-boxing
		long num2 = l1;  //Auto-unboxing
		System.out.println(num2);
		
		Byte b1 = 100;  //Auto-boxing
		byte num3 = b1;  //Auto-unboxing
		System.out.println(num3);
		
		Short s1 = 3233;  //Auto-boxing
		short num4 = s1;  //Auto-unboxing
		System.out.println(num4);
	}
}

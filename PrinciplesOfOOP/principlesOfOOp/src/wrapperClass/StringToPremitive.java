package wrapperClass;

public class StringToPremitive {
	
	public static void main(String[] args)
	{
		String s1 = "100";
		byte num1 = Byte.parseByte(s1);
		System.out.println(num1);
		
		String s2 = "30000";
		short num2 = Short.parseShort(s2);
		System.out.println(num2);
		
		String s3 = "23423432";
		int num3 = Integer.parseInt(s3);
		System.out.println(num3);
		
		String s4 = "45654645345";
		long num4 = Long.parseLong(s4);
		System.out.println(num4);
		
		String s5 = "213213.34434";
		float num5 = Float.parseFloat(s5);
		System.out.println(num5);
		
		String s6 = "8989203898";
		double num6 = Long.parseLong(s6);
		System.out.println(num6);
	}
}

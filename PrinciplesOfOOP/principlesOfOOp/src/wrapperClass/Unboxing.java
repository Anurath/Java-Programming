package wrapperClass;

public class Unboxing {

	public static void main(String[] args)
	{
		Integer i1 = new Integer(100);  //Boxing
		int num1 = i1.intValue(); //Unboxing
		System.out.println(num1+1);
		
		Long l1 = new Long(13023424l);  //Boxing
		long num2 =l1.longValue();  //Unboxing
	    System.out.println(num2/2);
	    
	    Character c1 = new Character('a');  //Boxing
	    char ch = c1.charValue();  //Unboxing
	    System.out.println(ch);
	}
}

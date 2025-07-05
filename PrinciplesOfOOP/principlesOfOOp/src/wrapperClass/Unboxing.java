package wrapperClass;

public class Unboxing {

	public static void main(String[] args)
	{
		Integer i1 = new Integer(100);  //Boxing
		int num1 = Integer.valueOf(i1); //Unboxing
		System.out.println(num1+1);
		
		Long l1 = new Long(13023424l);  //Boxing
		long num2 = Long.valueOf(l1);  //Unboxing
	    System.out.println(num2/2);
	    
	    Character c1 = new Character('a');  //Boxing
	    char ch = Character.valueOf(c1);  //Unboxing
	    System.out.println(ch);
	}
}

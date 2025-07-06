package finalKeyword;

public class FinalVariable1 {

	final static double PI;
	static
	{
		PI=22.0/7.0;
	}
	
	public static void main(String[] args)
	{
//		PI=20;    //can  not assing value to final static variable except static initializer
		System.out.println(PI);
	}
}

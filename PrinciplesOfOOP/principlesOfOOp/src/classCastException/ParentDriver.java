package classCastException;

public class ParentDriver {
	public static void main(String[] args)
	{
		Parent p1 = new Child1();        //Upcasting
		Child2 ch2 = (Child2)p1;
		p1.displayParent();   //classCastException
	}
}

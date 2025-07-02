package accessModifier;
import accessModifier2.AProtected;
public class ChildPr extends AProtected {
	public static void main(String[] args)
	{
		ChildPr c1 = new ChildPr();
		c1.test();
		c1.demo();
	}
}

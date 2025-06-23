package multipleInheritance;

public class InstragramDriver {
	public static void main(String[] args)
	{
		Instagram i1 = new InstragramImp1();
		
		i1.post("ram","Hello Kaisa hai!!!");
		
		i1.like();
	}
}

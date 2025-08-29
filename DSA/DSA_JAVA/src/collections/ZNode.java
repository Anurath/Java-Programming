package collections;

public class ZNode {

	Object val;
	
	Node preRef;
	
	Node nextRef;

	
	private ZNode()
	{
		//No arguments constructor
	}
	
	public ZNode(Object o)
	{
		val = o;
	}
	
	public Node next()
	{
		return nextRef;
	}
	
	public Node previous()
	{
		return preRef;
	}
	
	public boolean hasNext()
	{
		return nextRef!=null;
	}
	
	public boolean hasPrevios()
	{
		return preRef!=null;
	}
}

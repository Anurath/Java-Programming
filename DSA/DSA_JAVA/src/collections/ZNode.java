package collections;

public class Node {

	Object val;
	
	Node preRef;
	
	Node nextRef;

	
	private Node()
	{
		//No arguments constructor
	}
	
	public Node(Object o)
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

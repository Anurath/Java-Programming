package collections;

public class Node {

	Object val;
	
	Node preRef;
	Node nextRef;
	
	private Node() {}
	
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
		return nextRef==null;
	}
	
	public boolean hasPrevious()
	{
		return preRef==null;
	}
}

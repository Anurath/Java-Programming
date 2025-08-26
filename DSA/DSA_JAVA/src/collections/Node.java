package collections;

public class Node {

	Object val;
	
	Node preRef;
	
	Node nextRef;
	
	Node currRef;
	
	private Node()
	{
		//No arguments constructor
	}
	
	public Node(Object o)
	{
		val = o;
		currRef = this;
	}
	
	public Node next()
	{
		return nextRef;
	}
	
	public Node previous()
	{
		return this;
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

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
		val = 0;
		currRef = this;
	}
	
	public Node nextRef()
	{
		return nextRef;
	}
	
	public Node preRef()
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

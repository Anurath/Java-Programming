package Collection;

public class Node {
	
	Node prevNode;
	Node nextNode;
	Object val;
	
	private Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(Object val)
	{
		this.val = val;
	}

	public Node next()
	{
		return nextNode;
	}
	
	public Node previous()
	{
		return prevNode;
	}
	
	public boolean hasNext()
	{
		return nextNode!=null;
	}
	
	public boolean hasPrevious()
	{
		return prevNode!=null;
	}
}

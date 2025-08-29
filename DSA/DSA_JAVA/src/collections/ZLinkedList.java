package collections;

public class ZLinkedList {

	Node head;
	Node bhagwan;
	
	public ZLinkedList(){}
	
	public boolean addVal(Object o)
	{
		if(head==null)
		{
			head = new Node(o);
			bhagwan = head;
		}
		else
		{
			Node temp = new Node(o);
			
			bhagwan.nextRef = temp;
			temp.preRef = bhagwan;
			bhagwan = temp;
		}
		return true;
	}
	
	public Node iterate()
	{
		return head;
	}
}

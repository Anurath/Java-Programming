package Collection;

import hashset.Node;

public class LinkedList {

	Node head;
	Node bhagwan;
	private int size;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addVal(Object val)
	{
		if(head==null)
		{
			head = new Node(val);
			bhagwan = head;
			size++;
		}
		else {
			if(!containsNode(val))
			{
				Node temp = new Node(val);
				bhagwan.nextNode = temp;
				temp.prevNode = bhagwan;
				bhagwan = temp;
				size++;
			}	
			else {
				return false;
			}
		}
		return true;
	}
	
	public boolean containsNode(Object val)
	{
		Node temp = head ;
		while(temp!=null)
		{
			if(((Integer)val).equals(((Integer)temp.val)))
			{
				return true;
			}
			temp = temp.nextNode;
		}
		return false;
	}
	
	public void iterate()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.val+",");
			temp = temp.nextNode;
		}
	}
	public void reverseIterate()
	{
		Node temp = bhagwan;
		while(temp!=null)
		{
			System.out.print(temp.val+",");
			temp = temp.prevNode;
		}
	}
	public String toString()
	{
		Node temp = head;
		String ans = "";
		while(temp!=null)
		{
			ans +=temp.val+",";
			temp = temp.nextNode;
		}
		return ans;
	}
}

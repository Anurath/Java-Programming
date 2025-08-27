package collections;

public class LinkedList {

	Node head;
	Node bhagwan;
	int size;
	public LinkedList() {}
	
	public boolean addNode(Object o)
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
			bhagwan  = temp;
		}
		size++;
		return true;
	}
	
	public void iterate()
	{
		Node head = getHead();
		
		while(head!=null)
		{
			System.out.println(head.val);
			head = head.nextRef;
		}
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public Node containsNode(Object o)
	{
		Node head = getHead();
		
		while(head!=null)
		{
			if(((Integer)o).equals(((Integer)head.val)))
			{
				return head;
			}
			head = head.nextRef;
		}
		return null;
	}
	
	public boolean removeNode(Object o)
	{
		Node temp = containsNode(o);
		if(temp!=null)
		{
			if(temp.preRef!=null && temp.nextRef!=null)
			{
				temp.preRef.nextRef = temp.nextRef;
				temp.nextRef.preRef = temp.preRef;
			}
			else if(temp.preRef!=null && temp.nextRef==null)
			{
				bhagwan = bhagwan.preRef;
				bhagwan.nextRef = null;
			}
			else if(temp.preRef==null)
			{
				head = head.nextRef;
				head.preRef = null;
			}
		}
		size--;
		return true;
	}
	
	public boolean removeFirst()
	{
		if(head!=null)
		{
			head = head.nextRef;
			head.preRef = null;
			size--;
			return true;
		}
		System.out.println("LinkedList is empty!");
		return false;
	}
	
	public boolean removeLast()
	{
		if(bhagwan!=null&&bhagwan.preRef!=null)
		{
			bhagwan = bhagwan.preRef;
			bhagwan.nextRef=null;
			return true;
		}
		else if(bhagwan==null)
		{
			bhagwan = null;
			head = null;
			return true;
		}
		size--;
		return false;
	}
	
	public boolean addFirst(Object val)
	{
		Node temp = new Node(val);
		if(head!=null)
		{
			temp.nextRef  = head;
			head.preRef = temp;
			head = temp;
		}
		else if(head==null)
		{
			head = new Node(val);
			bhagwan = head;
		}
		size++;
		return true;
	}
	
	public void clearAll()
	{
		head = null;
		bhagwan = null;
	}
	
	public String toString()
	{
		if(head!=null)
		{
			StringBuffer sb = new StringBuffer();
			Node head = getHead();
			sb = sb.append("[");
			while(head!=null)
			{
				sb = sb.append(" "+head.val+",");
				head = head.nextRef;
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("]");
			return new String(sb);
		}
		return "[]";
	}
	
	public LinkedList removeAll(LinkedList ref)
	{		
		LinkedList newList = new LinkedList();
		Node head = getHead();
		Node head1 = ref.getHead();
		while(head!=null)
		{
			int n1 = (Integer)head.val;
			while(head1!=null)
			{
				int n2 = (Integer)head1.val;
				if(n1==n2)
				{
					newList.addNode(n1);
				}
				head1 = head1.nextRef;
			}
			head = head.nextRef;
			head1 = ref.getHead();
		}
		return newList;
	}
	
}

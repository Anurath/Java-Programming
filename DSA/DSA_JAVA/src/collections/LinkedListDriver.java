package collections;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
	
		
		LinkedList l2 = new LinkedList();
		l2.addNode(20);
		l2.addNode(40);
		l2.addNode(60);
		
		LinkedList ans=  l1.removeAll(l2);
		
		ans.iterate();
		
		
	}
}

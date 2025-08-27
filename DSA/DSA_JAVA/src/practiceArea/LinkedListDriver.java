package practiceArea;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		l1.addNode(50);
		l1.addNode(60);
	
		l1.addFirst(100);
		
		l1.iterate();
	}
}

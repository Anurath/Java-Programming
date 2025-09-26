package Collection;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(300);
		l1.addVal(200);
		
		l1.iterate();
		
		l1.addVal(20);
	}
}

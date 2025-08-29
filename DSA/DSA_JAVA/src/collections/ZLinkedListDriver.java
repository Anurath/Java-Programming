package collections;

public class ZLinkedListDriver {

	public static void main(String[] args) {
		ZLinkedList l1 = new ZLinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		//Iterate
		Node head =  l1.iterate();
		
		do {
			System.out.println(head.val);
			head = head.next();
		}while(head!=null);
	}
}
 
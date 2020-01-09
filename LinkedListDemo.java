import java.util.Iterator;

/**
 * @author Deshica Bolledula
 *
 */
public class LinkedListDemo {
	
	static class Node {
		
		int data;
		Node next;
	
		Node(int d)
		{
		data = d;
	}
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}


}

	public static void main(String[] args) {
		
		Node head;
		Node tail;
		Node firstNode = new Node(10);
		Node secondNode = new Node(20);
		firstNode.next = secondNode;
		secondNode.next = null;
		head = firstNode;
		tail = secondNode;
		Node temp = head;
		

		Iterator it = temp.iterator();
		while(it.hasNext()) {
						
			System.out.println(it.hasNext());
			}
		
	}

}
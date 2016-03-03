
package singly.linked.lists;

public class LoopDetectionInLL {


	public static void main( String args[]){

		LinkedList ll = new LinkedList() ;
		ll.push(20);
		ll.push(4);
		ll.push(15);
		ll.push(10);

		/*Create loop for testing */
		ll.head.next.next.next.next = ll.head;
		boolean loop = detectLoop(ll.head) ;

		if( loop){
			System.out.println("Removed loop");
		}else{
			System.out.println("No Loop Found.");
		}

	}
	/**
	 * If there is a loop, then the slow & fast pointer will always meet at some node of the loop.
	 * ( not necessarily the end points). They meet at the end point when the no of nodes
	 * constituting the loop is even. else they meet at any random node that constitute the loop.
	 * We need to determine the start & end point of the loop.
	 * This method detects the end point of the loop and sets its next to null. 
	 * @param head
	 * @param slow
	 */
	private static Node removeLoop(Node head, Node loop) {

		Node ptr1 = head ;
		Node ptr2 = loop ;	// loop denotes the meeting point of the slow & fast pointers.
		
		while( 1== 1){
			
			ptr2 = loop ;
			
			while( ptr2.next != loop && ptr2.next != ptr1){
				ptr2 = ptr2.next ;
			}
			
			if( ptr2.next == ptr1){	// loop!
				break ;
			}
			
			ptr1 = ptr1.next ;
		}
		
//		At the end ptr2 will point to the end of the loop
		ptr2.next = null ;
		return head ;
	}

	/** 
	 * @param head
	 * @return
	 */
	private static boolean detectLoop(Node head) {

		if( head == null )
			return false ;

		Node slow = head ;
		Node fast = head ;

		while( fast != null){

			fast = fast.next ;

			if( fast != null){

				slow = slow.next ;
				fast = fast.next ;

				if( slow == fast){
					// Loop found.
					head = removeLoop(head, slow) ;
					Node current = head ;
					while( current != null){
						System.out.print( current.data + " ");
						current = current.next ;
					}
					return true ;
				}

			}
		}
		return false;
	}


}

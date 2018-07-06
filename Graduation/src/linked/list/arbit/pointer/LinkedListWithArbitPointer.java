package linked.list.arbit.pointer;

public class LinkedListWithArbitPointer {


	public static void main( String[] args){

		/**
		 * Constructing a linked list.
		 */
		
		Node node1 = new Node(1) ;
		Node node2 = new Node(2) ;
		Node node3 = new Node(3) ;
		Node node4 = new Node(4) ;
		
		// next pointers
		node1.next = node2 ;
		node2.next = node3 ;
		node3.next = node4 ;
		node4.next = null ;
		
		node1.arbit = node3 ;
		node2.arbit = node1 ;
		node3.arbit = node4 ;
		node4.arbit = node1 ;
		
		clone(node1) ;
	}
	
	
	/**
	 * Given the node to such a linked list, clone it and return the
	 * pointer to the cloned copy.
	 * @param head
	 * @return
	 */
	public static Node clone( Node head){
		
		Node current = head ;

		/** Inserting a clone of the node right after each node. **/
		while( current != null){
			Node newnode = new Node(2* current.data) ;
			newnode.next = current.next ;
			current.next = newnode ;
			current = current.next.next ;
		}
		
		/**
		 * Building the arbit links for the clones
		 */
		current = head ;
		Node copyHead = head.next ;
		
		
		while( current != null){
			current.next.arbit = current.arbit.next ;
			current = current.next.next ;
		}
		
		current = head ;
		copyHead = head.next ;
		Node copyCurrent = copyHead ;
		
		while( current != null && copyCurrent != null){
			current.next = current.next.next ;
			copyCurrent.next = copyCurrent.next.next ;
		}
		
		while( copyCurrent != null){

			System.out.println(copyCurrent.data);
			copyCurrent = copyCurrent.next ;
		}

		return copyHead ;
	}
	
	

}

package linked.lists.circular.using.tail.ptr;

import linked.lists.single.Node;

/**
 * Here, we assume we have a linked list that is circular i.e. the last node points back to its head node.
 * We are only told about the tail pointer. We implicitly know that the head pointer is tail.next
 * 
 * @author prutha
 *
 */

public class CircularLinkedList {

	public Node tail ;

	public CircularLinkedList(){
		this.tail = null ;
	}

	public CircularLinkedList( Node tail){
		this.tail = tail ;
	}

	/**
	 * This method inserts the new node with the data at the 
	 * start of the circular ll, given only the tail node.
	 * 
	 * @param data
	 * @return
	 */
	public Node insertAtTail( int data){

		Node newNode = new Node( data) ;

		if( tail == null){
			tail = newNode ;
			return tail ;
		}

		newNode.next = tail.next ;
		tail.next = newNode ;
		tail = tail.next ;
		return tail ;
	}

	/**
	 * Given only the tail pointer, insert a newnode, at the start of the circular linked list.
	 * This is equivalent to simply inserting the node after the tail, but with the only difference
	 * that this time you dont advance the tailer pointer. The node inserted at tail.next
	 * is implicitly the new head.
	 * @param data
	 * @return
	 */
	public Node insertAtStart( int data ){

		if( tail == null){
			tail = new Node( data) ;
		}
		// Step 1. Copy the entry node into a new node.
		Node newnode = new Node() ;
		newnode.next = tail.next ;
		tail.next = newnode ;
		return tail ;
	}

	/**
	 * The trick is to start iterating from the node next to the entry & go on till you reach entry.
	 * The moment the current node becomes equal to entry, we break out.
	 * Make sure you print the entry node in the beginning itself.
	 * @param entry
	 */
	public void printlist( Node entry) {

		if( tail == null){
			System.out.println("Empty List.");
			return ;
		}

		// Print the entry data first.
		Node current = tail.next ;

		while( current != null && current != tail ){
			System.out.print(current.data + " ");
			current = current.next ;
		}

		System.out.println(current.data);
		System.out.println();
	}

	
	public boolean lookup(int key ) {

		if( tail == null)
			return false ;

		else if( tail.data == key )
			return true ;

		Node current = tail.next ;

		while( current != null && current != tail){
			if( current.data == key)
				return true ;
			current = current.next ;
		}

		return false ;
	}

	public Node removeAtStart(){

		Node deleted = tail.next ;
		tail = tail.next ;
		deleted.next = null ; 
		return deleted ;
	}

	public Node removeAtEnd(){
		tail.data = tail.next.data ;
		Node deleted = tail.next ;
		tail.next =tail.next.next ;
		deleted.next = null ; 
		return deleted ;
	}
}

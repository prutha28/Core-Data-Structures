package linked.lists.circular;

import linked.lists.single.Node;

/**
 * Here, we assume we have a linked list that is circular i.e. the last node points back to its head node.
 * We are only told about the entry pointer. We do not know the tail pointer or
 * have random access to any node in the linked list. 
 * 
 * @author prutha
 *
 */

public class CircularLinkedList {

	public Node entry ;
	
	public CircularLinkedList(){
		this.entry = null ;
	}
	
	public CircularLinkedList( Node entry){
		this.entry = entry ;
	}

	/**
	 * This method inserts the new node with the data at the 
	 * start of the circular ll, given only the entry node.
	 * 
	 * @param data
	 * @return
	 */
	public Node insertAtStart( int data){
		
		Node newNode = new Node( data) ;
		
		if( entry == null){
			entry = newNode ;
			return entry ;
		}
		
		newNode.next = entry ;
		entry = newNode ;
		return entry ;
	}
	
	/**
	 * Given only the entry point, insert a newnode, at the tail of the circular linked list.
	 * This is equivalent to inserting the newnode at the beginning of the linked list and then 
	 * moving the head pointer one position ahead.
	 * 
	 * We first create the new node with data equal to entry node.
	 * this is then inserted just after the entry node.
	 * @param data
	 * @return
	 */
	public Node insertAtTail( int data ){
		
		if( entry == null){
			entry = new Node( data) ;
			entry.next = entry ;
		}
		// Step 1. Copy the entry node into a new node.
		Node newnode = new Node() ;
		newnode.data = entry.data ;
		newnode.next = entry.next ;
		
		// Step 2. Make the entry node point to the new one.
		entry.next = newnode ;
		
		// Step 3. Change the data in the entry node to the new data.
		entry.data = data ;
		
		// Step 4. Finally shift the entry pointer one position ahead.
		entry = entry.next ;
	
		return entry ;
	}

	/**
	 * The trick is to start iterating from the node next to the entry & go on till you reach entry.
	 * The moment the current node becomes equal to entry, we break out.
	 * Make sure you print the entry node in the beginning itself.
	 * @param entry
	 */
	public void printlist( Node entry) {

		if( entry == null){
			System.out.println("Empty List.");
			return ;
		}

		// Print the entry data first.
		System.out.print(entry.data + " ");
		Node current = entry.next ;
		
		while( current != null && current != entry ){
			System.out.print(current.data + " ");
			current = current.next ;
		}
		
		System.out.println();
	}

	public boolean lookup(int key ) {
		
		if( entry == null)
			return false ;
		
		else if( entry.data == key )
			return true ;
		
		Node current = entry.next ;
		
		while( current != null && current != entry){
			if( current.data == key)
				return true ;
			current = current.next ;
		}
		
		return false ;
	}
}

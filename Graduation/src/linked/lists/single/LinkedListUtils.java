package linked.lists.single;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedListUtils {

	LinkedList ll ;

	public LinkedListUtils( LinkedList ll){
		this.ll = ll ;
	}

	// Iterative
	public int countOccurences( int element ){
		Node current = ll.head ;
		int count = 0 ;

		if( current == null)
			return 0;

		while( current != null){
			if( current.data == element)  
				count++;
			current = current.next ;
		}
		return count ;
	}

	// Recursive
	public int countOccurences( Node current, int element ){

		if( current == null)
			return 0 ;

		if( current.data == element)
			return (1 + countOccurences(current.next, element)) ;
		else
			return countOccurences(current.next, element) ;
	}	

	/**
	 * @return the element at the nth position from the beginning, -1 if the element is not found. 
	 */
	public int getNth( int index ){
		Node current = ll.head ;
		if( current == null )
			return -1 ;

		int count = 0 ;

		while( current != null ){
			if( count == index)
				return current.data ;
			current = current.next ;
			count++ ;
		}
		return -1 ;
	}

	public int getNthfromEnd( int index){
		return getNth(ll.count() - index + 1) ;
	}


	public void deleteList(){
		Node current = ll.head ;
		Node temp = ll.head.next ;

		while( current.next != null){
			temp = current.next ;
			current.data = -1 ;
			current = temp ;
		}
	}

	/**
	 * Given a linked list that is already sorted, insert a new node into it
	 * such that the resulting list is still sorted.
	 * 
	 * @param resultHead the head of the resulting linked list.
	 * @param data to be inserted
	 * @return the head pointer of the resulting linked list.
	 */
	public Node sortedInsert( Node resultHead, int data ){

		Node newNode = new Node(data) ;

		// Empty List or Inserting node at the head		 Tricky !!!
		if( resultHead == null || newNode.data < resultHead.data ){
			newNode.next = resultHead ;
			resultHead = newNode ;
			return resultHead ;
		}
		// Non Empty List
		Node current = resultHead ;
		Node prev = current ;

		while( current != null && current.data < newNode.data){
			prev = current ;
			current = current.next ;
		}

		// end of the list is reached
		if( current == null){
			prev.next = newNode ;
		}
		else if( current.data >= newNode.data){
			newNode.next= current ;
			prev.next = newNode ;
		}

		return resultHead ;
	}

	// Same as above, but using a single pointer.
	public Node sortedInsert2( Node head, int key ){

		Node newnode = new Node( key) ;

		if( head == null || head.data > key){
			newnode.next = head ;
			head = newnode ;
			return head ;
		}


		Node current = head ;

		while( current.next != null && current.next.data < key){
			current = current.next ;
		}

		if( current.next == null){
			current.next = newnode ;
		}else{ // if(current.next.data >= key)
			newnode.next = current.next ;
			current.next = newnode ;
		}
		return head ;

	}


	/**
	 * Given the reference to a linked list ( unsorted), rearrange the nodes 
	 * so that they are sorted.
	 * @param head
	 */
	public Node insertSort( Node head){

		Node resultHead = null ;
		Node current = head ;

		if( head == null)
			return null ;

		while( current != null ){
			resultHead = sortedInsert(resultHead, current.data) ;
			current = current.next ;
		}

		return resultHead ;
	}

	public Node split( Node head ){
		Node head1 = head ;
		Node head2 = null ;

		Node fast = head1, slow = head1;

		while( fast != null ){

			fast = fast.next ;

			if( fast != null){
				fast = fast.next ;
				slow = slow.next ;
			}
		}

		head2 = slow.next ;
		slow.next = null ;
		return head2 ;
	}


	// Remove duplicates from sorted linked list : O(nlogn) for sorting Time & O(1) Space.
	public Node removeDuplicates( Node head ){

		// Empty List
		if( head == null)
			return null ;

		if( head.next == null)
			return head ;

		Node prev = head ;
		Node current = prev.next ;

		while( current != null){

			//			current = prev.next ;

			if( prev.data == current.data){
				prev.next = current.next ;	// Tricky !  Dont advance prev yet. There could be 3 adjacent elements that are equal.
			}else{
				prev = current ;	// Tricky ! Only advance prev when adjacent elements are not equal 
			}

			current = current.next ;
		}
		return head ;
	}


	public Node removeDuplicatesSorted( Node head ) {

		if( head == null ) 
			return null ;

		else if( head.next == null)
			return head ;

		Node current = head ;

		// Step 1: Traverse the linked list & Maintain the counts.
		// Note that we are using a LinkedHashMap, so keys can be retreived in the the order of insertion.
		LinkedHashMap<Integer, Integer> nodeCountMap = new LinkedHashMap<Integer, Integer>();

		while( current != null){

			if( nodeCountMap.get(current.data) == null){
				nodeCountMap.put(current.data, 1) ;
			}else{
				int count = nodeCountMap.get(current.data) ;
				nodeCountMap.put(current.data, 1 + count) ;
			}

			current = current.next ;
		}


		Iterator<Integer> itr = nodeCountMap.keySet().iterator() ;
		Node newHead = new Node( itr.next()) ;
		Node newCurrent = newHead ;

		while( itr.hasNext()){
			Node newnode = new Node( itr.next()) ;
			newCurrent.next = newnode ;
			newCurrent = newnode ;
		}

		return newHead ;
	}


	// Remove duplicates from unsorted linked list : O(n) for sorting Time & O(n) Space.

	public Node removeDuplicatesUnsorted( Node head ){

		Node current = head ;
		Node prev = current ;
		HashMap<Integer, Boolean> elementPresentMap = new HashMap<Integer, Boolean>() ;

		while( current != null){
			prev = current ;
			int key = current.data ;

			if( elementPresentMap != null){
				if( elementPresentMap.get(key) == Boolean.TRUE){
					// Element is already present
					//					elementPresentMap.put(key, false) ;
					prev.next = current.next ;
					current.next = null ;
				}
				else{
					// Element is not present
					elementPresentMap.put(key, true) ;
				}
			}
			current = current.next ;
		}

		return head;

	}

	public Node reversell(Node head) {

		// Empty List
		if( head == null)
			return null ;

		// Single element list
		else if( head.next == null){
			return head ;
		}

		Node previous = head ;
		Node current = head.next ;
		Node nextnode = head.next.next ;

		while( current.next != null){
			nextnode = current.next ;
			current.next = previous ;
			previous = current ;
			current = nextnode ;
		}
		current.next = previous ; // Tricky!
		head.next = null ;		// Making the first link's next pointer null.
		head = current ;		// new head.
		return head ;
	}

	// Recursively clones the linked list.
	// Traverses till the end( where the head becomes null)
	public static Node clone( Node head){

		// Base Case
		if( head == null)
			return null ;	// happens at the node after the last one.

		Node cloned = clone( head.next) ;
		Node newnode = new Node( head.data) ;
		newnode.next = cloned ;
		return newnode ;	// At each stage the address of the cloned node is returned. This is then set as the next ptr in the previous level of recursion.
	}

	/**
	 * Appends 2 linked lists & returns the hea dof the resulting linked list.
	 * @param aHead
	 * @param bHead
	 * @return
	 */
	public static Node append( Node aHead, Node bHead){

		if( aHead == null){
			return bHead ;
		}

		Node aCurrent = aHead ;

		while( aCurrent.next != null ){
			aCurrent = aCurrent.next ;
		}

		aCurrent.next = bHead ;
		bHead = null ;

		return aHead ;
	}

	/**
	 * Splits the list into half & returns the head of the latter half
	 * @param head
	 * @return
	 */
	public Node frontBackSplit( Node head ){

		if( head == null)
			return null ;

		else if( head.next == null ){
			return head ;
		}

		Node slow = head ;
		Node fast = head.next ;

		while( fast != null){
			fast = fast.next ;

			if( fast != null){
				slow = slow.next ;
				fast = fast.next ;
			}
		}

		Node newHead = slow.next ;
		slow.next = null ;
		return newHead ;
	}

	/**
	 * Given two sorted linked lists, perform the intersection of the lists and return the head of the 
	 * resultant linked list.
	 * @param head1
	 * @param head2
	 * @return
	 */
	public Node sortedIntersect(Node head1, Node head2) {

		if( head1 == null)
			return head2 ;

		if( head2 == null)
			return head1 ;

		if( head1 == null && head2 == null)
			return null ;

		Node current1 = head1;
		Node current2 = head2;
		LinkedList result = new LinkedList() ;

		while( current1 != null && current2 != null){

			if( current1.data == current2.data){
				result.push(current1.data) ;
				current1 = current1.next ;
				current2 = current2.next ; 
			}else if( current1.data < current2.data){
				current1 = current1.next ;
			}else{
				current2 = current2.next ;
			}
		}

		return result.head ;

	}


	/**
	 * Given the head pointer to a linked list, split it into 2 sublists, such that
	 * alternate nodes are placed in the 2 lists.
	 * For the sake of convenience we shall print both the lists. 
	 * @param head
	 * @return the pointer to the second list
	 */
	public void alternatingSplit( Node head ){

		if( head == null ||  head.next == null){
			System.out.println("Empty List.");
			return  ;
		}

		Node aHead = head ;
		Node bHead = head.next ;

		Node current = head ;
		Node aCurrent = bHead ;
		Node bCurrent = aHead ;

		while( current != null){
			aCurrent = current ;
			current = current.next ;
			bCurrent = current ;
			if( current != null)
				current = current.next ;
		}

		System.out.println("The first list:");

		aCurrent = aHead ;
		while( aCurrent != null){
			System.out.print(aCurrent.data + " ");
			aCurrent = aCurrent.next ;
		}
		System.out.println();
		
		bCurrent = bHead ;
		System.out.println("The second list:");
		while( bCurrent != null){
			System.out.print(bCurrent.data + " ");
			bCurrent = bCurrent.next ;
		}
		
		System.out.println();
	}


	public Node shuffleMerge( Node head1, Node head2){
		
		Node current = null ;
		Node current1 = head1 ;
		Node current2 = head2 ;
		
		while( current1 != null && current2 != null){
			current = current1 ;
			current1 = current1.next ;
			current.next = current2 ;
			current2 = current2.next ;
			current = current.next.next ;
		}
		
		while( current1 != null){
			current.next = current1 ;
			current1 = current1.next ;
			current = current.next ;
		}
		
		while( current2 != null){
			current.next = current2 ;
			current2 = current2.next ;
			current = current.next ;
		}
		
		return head1 ;
	}
	
	
	

}





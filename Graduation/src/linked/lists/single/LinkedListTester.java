package linked.lists.single;

public class LinkedListTester {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList() ;
		LinkedListUtils utils = new LinkedListUtils(ll) ;

		System.out.println("----------------------------INSERTIONS----------------------------------");
		System.out.println("Pushing 100");
		ll.push(100) ;

		System.out.println("Pushing 10");
		ll.push(10) ;

		System.out.println("Inserting 99 at position 1");
		ll.insertAtN(99, 1) ;
		System.out.println("Inserting 50 at position 3");
		ll.insertAtN(50, 3) ;
		System.out.println("Inserting 70 at position 4");
		ll.insertAtN(70, 4) ;

		System.out.println("Printing the elements of linked list.");
		ll.recursivePrint(ll.head) ;
		System.out.println();
		System.out.println("Printing the elements of linked list in reverse order.");
		ll.reversePrint(ll.head) ;

		System.out.println();
		System.out.println("Appending 122 to the tail");
		ll.appendToTail(122) ;
		System.out.println("Appending 93 to the tail");
		ll.appendToTail(93) ;
		System.out.println("Pushing 87");
		ll.push(87) ;
		ll.recursivePrint(ll.head) ;

		System.out.println();
		System.out.println("----------------------------DELETIONS----------------------------------");
		System.out.println();
		System.out.println("After deleting the element " + ll.deleteFromHead() + " from the head" );
		ll.recursivePrint(ll.head) ;

		//		System.out.println();
		//		System.out.println("After deleting the element " + ll.deleteFromPos(3) + " from the position 3" );
		//		ll.print() ;

		//		System.out.println();
		//		System.out.println("After deleting the element " + ll.deleteFromTail() + " from the tail" );
		//		ll.print() ;

		ll.appendToTail(100) ;
		ll.appendToTail(50) ;
		ll.appendToTail(50) ;
		System.out.println("\nBefore removing duplicates");
		ll.print() ;
		System.out.println("After removing duplicates");
		ll.head = utils.removeDuplicatesUnsorted(ll.head) ;
		ll.print() ;

		System.out.println("----------------------------SEARCHING----------------------------------");
		System.out.println("The element 100 was found at index " + ll.search(100));
		System.out.println("The element 78 was found at index " + ll.search(78));

		if( ll.isFound(30)){
			System.out.println("The number 30 is found.");
		}else{
			System.out.println("The number 30 is not found.");
		}

		ll.print() ;

		LinkedList result = new LinkedList() ;

		result.head = utils.insertSort(ll.head) ;
		result.print() ;
		System.out.println("------------------------------------------");
		result.head = utils.sortedInsert( result.head, 88) ;
		result.head = utils.sortedInsert( result.head, 40) ;
		result.head = utils.sortedInsert( result.head, 21) ;
		result.head = utils.sortedInsert( result.head, 5) ;
		result.head = utils.sortedInsert( result.head, 10) ;
		result.print() ;

		System.out.println("------------------------------------------");
		result.head = utils.sortedInsert2( result.head, 88) ;
		result.head = utils.sortedInsert2( result.head, 40) ;
		result.head = utils.sortedInsert2( result.head, 21) ;
		result.head = utils.sortedInsert2( result.head, 5) ;
		result.head = utils.sortedInsert2( result.head, 10) ;
		result.print() ;

		// Cloning
		System.out.println("Cloning the previous linked list.");
		Node clonedHead = utils.clone(result.head) ;
		LinkedList clonedLL = new LinkedList(clonedHead) ;
		clonedLL.print() ;

		// Removing Duplicates
		System.out.println("After removing duplicates ...");
		clonedHead = utils.removeDuplicates(clonedHead) ;
		clonedLL.print() ;

		//  linked list reversal
		//	result.head = utils.reversell(result.head) ;
		//	result.print() ;

		//	System.out.println("After removing duplicates");
		//	clonedLL.head = utils.removeDuplicatesSorted(clonedLL.head) ;
		//	clonedLL.print() ;
		
		
		// Sorted Intersect
		System.out.println("Sorted Intersect");
		Node clonedHead1 = utils.clone(ll.head) ;
		LinkedList clonedLL1 = new LinkedList(clonedHead1) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 33) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 12) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 56) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 36) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 18) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 19) ;
		clonedHead1 = utils.sortedInsert(clonedHead1, 27) ;
		clonedLL1.print() ;
		
		Node clonedHead2 = utils.clone(result.head) ;
		LinkedList clonedLL2 = new LinkedList(clonedHead2) ;
		clonedLL2.print() ;
		
		Node intersectionHead = utils.sortedIntersect(clonedLL1.head, clonedLL2.head) ;
		LinkedList intersectionLL = new LinkedList(intersectionHead) ;
		intersectionLL.print() ;
		
		// Alternating Split
		System.out.println();
		System.out.println("Linked list before spliting");
		clonedLL2.print() ;
		System.out.println("Linked list after spliting");
		utils.alternatingSplit(clonedLL2.head) ;
		
		// Shuffle Merge
		LinkedList ll1 = new LinkedList() ;
		ll1.push(1) ;
		ll1.push(2) ;
		ll1.push(3) ;
		ll1.print() ;
		
		LinkedList ll2 = new LinkedList() ;
		ll2.push(7) ;
		ll2.push(13) ;
		ll2.push(11) ;
		ll2.print() ;
		
		Node resultHead = utils.shuffleMerge(ll1.head, ll2.head) ;
		LinkedList r = new LinkedList(resultHead) ;
		r.print() ;
		
		
	}
}
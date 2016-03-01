package circular.linked.lists;

public class CircularLinkedListTest {

	public static void main(String[] args) {

		CircularLinkedList cl = new CircularLinkedList() ;
		
		// Insertions
		cl.insertAtStart( 2 ) ;
		cl.printlist(cl.entry) ;
		cl.insertAtStart( 5 ) ;
		cl.printlist(cl.entry) ;
		cl.insertAtTail( 6 ) ;
		cl.insertAtTail( 7 ) ;
		cl.insertAtTail( 4 ) ;
		cl.printlist(cl.entry) ;
		
		// Searching
		boolean found = cl.lookup(6) ;
		System.out.println(found);
		
		// Removals
	}

}

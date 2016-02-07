package linked.lists;

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
	
}

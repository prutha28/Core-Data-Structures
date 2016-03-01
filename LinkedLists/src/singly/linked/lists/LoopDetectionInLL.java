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
        	System.out.println("Removing loop");
//        	removeLoop(ll.head) ;
        }else{
        	System.out.println("No Loop Found.");
        }
        
	}

	private static void removeLoop(Node head, Node slow) {
		
	}

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
					removeLoop(head, slow) ;
					return true ;
				}
				
			}
		}
		return false;
	}
	
	
}

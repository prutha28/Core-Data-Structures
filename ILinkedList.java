
public interface ILinkedList{

	public SLLIterator iterator() ;
		
	public void push( int data ) ;

	public void insertAtFront( int data ) ;
	
	public void insertAtEnd( int data ) ;

	public int deleteAtFront() ;

	public int deleteAtStart() ;

	public int elementAtIndex( int index ) ;

	public int deleteElementAtIndex( int index ) ;
		
}
package queues.using.fixed.circular.arrays;

public interface IQueue {

	// offer
	public void enqueue( int element ) throws QueueFullException ;
	
	// poll
	public int dequeue() throws QueueEmptyException ;
	
	// peek
	public int front() ;
	
	public int end() ;
	
	public int size() ;
	
	public boolean isFull() ;
	
	public boolean isEmpty() ;
}

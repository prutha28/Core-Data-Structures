package queues.using.fixed.circular.arrays;

/**
 * 	
 @author prutha!
 *
 * QUEUES USING CIRCULAR ARRAYS OF A GIVEN SIZE.
 *
 * front, rear = -1
 * ------------------------------------------
 * | | | | | | | | | | |
 * ------------------------------------------
 *  0 1 2 3 4 5 6 7 8 9
 *
 * front = 0       rear = 4
 * -----------------------------
 * | 2 | 5 | 6 | 8 | | | | | | | size = rear - front = 4 - 0 = 4
 * -----------------------------
 *  0    1   2   3  4 5 6 7 8 9
 *
 * After removing 2 elements in the front, 
 *      front = 2       rear = 6
 * ------------------------------------------
 * | | | 6 | 8 | 7 | 9 | | | | |
 * ------------------------------------------
 * 0  1  2   3   4   5  6 7 8 9
 *
 *
 *      front = 2                   rear = 9
 * ------------------------------------------
 * | | | 6 | 8 | 7 | 9 | 1 | 2 | 4 | |
 * ------------------------------------------
 *  0 1  2   3   4   5   6   7   8  9
 *
 *
 * rear = 0 front = 2               size = rear - front = 0 -2 = -2 || -2 + 10 = 8
 * -----------------------------------------
 * | | | 6 | 8 | 7 | 9 | 1 | 2 | 4 | 3 |
 * -----------------------------------------
 *  0 1  2   3   4   5   6   7   8   9
 *
 * Initially front, rear both will be -1.
 * We add elements to the rear of the queue.
 * and remove from front.
 *
 * Front is the index of element to be removed next.
 * Rear is the index at which you will insert the element.
 *
 * Thus, if u want to increment rear beyond n-1, rear = ( 9 + 1 ) % 10
 * rear = (rear + 1) % SIZE
 *
 * When rear & front are equal, the queue may either be full or it may be empty.
 * To distinguish between the two, we will make the queue hold ATMOST n-1 elements
 * so that whenever rear+1 = front, we say queue is full &
 * when front == rear then queue is empty.
 *
 *
 * rear = 1   front = 2 ---> FULL, rear + 1 == front (rear+1) % SIZE == front
 * -----------------------------------------
 * | 8 |Empty| 6 | 8 | 7 | 9 | 1 | 2 | 4 | 3 |
 * -----------------------------------------
 *   0   1     2   3   4   5   6   7   8   9
 *
 *
 *
 * front = 0                           rear = 9 ---> FULL 
 * rear + 1 == SIZE .. (rear+1) % SIZE == front
 * -----------------------------------------
 * | 8 | 7 | 6 | 5 | 4 | 9 | 1 | 2 | 5 | |
 * -----------------------------------------
 *   0   1   2   3   4   5   6   7   8  9
 *
 *
 *
 * front = 3 rear = 9 ---NOT FULL rear + 1 == SIZE ..
 * -----------------------------------------
 * | | | | 5 | 4 | 9 | 1 | 2 | 5 | |
 * -----------------------------------------
 * 0 1 2 3 4 5 6 7 8 9
 *
 *
 *
 * The key point to remember for Circular Arrays of some fixed size 'SIZE'
 * is that the increment takes place like this.. x = (x+1) % SIZE
 * instead of the normal x = x+1
 * 
 * ASSUMPTIONS : 
 * 
 * We assume that the arrays can hold maximum of ( SIZE-1) elements to distinguish the case
 * of empty & full arrays.
 *
 */
public class CircularQueue implements IQueue {

	private static final int CAPACITY = 10 ;
	int front ;
	int rear ;
	int[] data = new int[ CAPACITY] ;

	public void enqueue(int element) throws QueueFullException {
		if( isFull()){
			throw new QueueFullException("Queue is full!") ;
		}
		data[ rear ] = element ;
		rear = ( rear + 1 ) % CAPACITY ;	// Critical
	}

	public int dequeue() throws QueueEmptyException {
		if( isEmpty()){
			throw new QueueEmptyException("Queue is empty!") ;
		}
		int popped = data[ front ] ; 
		data[front ] = -1;
		front = (front + 1) % CAPACITY ;	// Critical
		return popped ;
	}

	public int front() throws QueueEmptyException {
		if( isEmpty()){
			throw new QueueEmptyException("Queue is empty!") ;
		}
		return data[front];
	}

	public int end() throws QueueEmptyException {
		if( isEmpty()){
			throw new QueueEmptyException("Queue is empty!") ;
		}
		return data[rear - 1] ;		 // Critical 
	}

	public int size() {
		if( front < rear)
			return (rear -front);
		else if( front ==  rear )
			return 0;
		else
			return (CAPACITY + rear -front) ;	// Critical
	}

	public boolean isFull() {

		// Critical
		if( CAPACITY -1 == size() )
			return true ;
		else
			return false ;
	}

	public boolean isEmpty() {
		return ( rear == front);
	}

	public void display() {

		if( isEmpty()){
			System.out.println("Queue is empty!");
			return ;
		}
		System.out.println("The contents of the queue from front to rear are :");
		int i = front ;
		while( i < size() ){// Critical .. not  i < rear
			System.out.print( data[i] + " ");
			i = (i + 1) % CAPACITY ;
		}
		System.out.println();
	}

}

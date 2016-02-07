package heap;

public class Heap implements IHeap{

	int heapArray[] ;
	int heapLength ; 
	
	public Heap(){
		
	}
	
	public int parent(int i) {
		return (i-1)/2;
	}

	public int left(int i) {
		return ( 2* i + 1 ) ;
	}

	public int right(int i) {
		return ( 2* i + 2 ) ;
	}

}

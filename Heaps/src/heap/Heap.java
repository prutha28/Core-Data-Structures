package heap;

import java.util.Arrays;

public class Heap implements IHeap{

	int heapArray[] ;
	int heapSize ; // no of elements in the heap. not necessarily equal to heapArray.length. 
	
	public Heap(){ 
		heapSize = 0 ;
	}
	
	public Heap(int arr[]){ 
		heapArray = Arrays.copyOf(arr, arr.length) ;
		heapSize = arr.length ;
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

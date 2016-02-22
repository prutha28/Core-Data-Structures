package heap;


public class MaxHeap extends Heap{

	/**
	 * Given an array A, that represents the heap data and the index i, 
	 * make sure the array is converted to a max heap. 
	 * 
	 * To max-heapify at index i, the algo assumes that both the children of the element indexed at i, are 
	 * themselves max heaps.
	 * @param A
	 * @param i
	 */

	public MaxHeap(){
		super() ;
	}

	public MaxHeap(int a[]){
		super(a) ;
	}

	public void maxHeapify( int a[] , int i){

		int l = left(i) ; // index of left child
		int r = right(i) ; // index of right child
		int largest = i ;
		this.heapArray = a ;

		if( l < heapSize && heapArray[l] > heapArray[i]){
			largest = l ;
		}

		if( r < heapSize && heapArray[r] > heapArray[largest]){
			largest = r ;
		}

		if( largest != i){
			// Swap A[largest] & A[i]
			int temp = heapArray[i] ;
			heapArray[i] = heapArray[largest] ;
			heapArray[largest] = temp ;
			maxHeapify( heapArray , largest) ;
		}
	}


//	public void buildMaxHeap(int a[] ){
	public void buildMaxHeap(){
//		this.heapArray = a ;
		int i = lastNonLeafIndex() ;
		while( i >= 0 ){
			maxHeapify( heapArray , i) ;
			i-- ;
		}
	}

	public void insertElement( int x){
		int newHeapArray[] = new int[++heapSize] ;
		int i ;
		for ( i = 0; i < heapArray.length; i++) {
			newHeapArray[i] = heapArray[i] ;
		}
		newHeapArray[i] = x ;
		heapArray = newHeapArray ;
//		buildMaxHeap(heapArray) ;
		buildMaxHeap() ;
	}

	public void heapSort(){
		// 1. Build a max heap
//		buildMaxHeap(heapArray) ;
		buildMaxHeap() ;
		// 2. Swap the first element with the last element.
		while( heapSize > 0 ){
			int root = extractRoot() ;
			heapArray[0] = heapArray[ heapSize-1] ;
			heapArray[ heapSize-1]  = root ;
			heapSize -= 1 ;
		}
	}

	public int extractRoot(){
//		buildMaxHeap(heapArray) ;
		buildMaxHeap() ;
		return heapArray[0] ;
	}


	public int lastNonLeafIndex(){
		return ((heapSize/2) -1 ) ;
	}

	public void print() {
		for (int i = 0; i < heapArray.length; i++) {
			System.out.print(heapArray[i] + " ");
		}
		System.out.println();
	}
}

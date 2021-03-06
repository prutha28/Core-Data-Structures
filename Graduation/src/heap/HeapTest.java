package heap;

public class HeapTest {

	public static void main(String[] args) {

		int a[] = {  21, 4, 5, 8, 1, 3, 9, 89}  ;

		MaxHeap maxHeap = new MaxHeap(a) ;
		System.out.println("The original heap array");
		maxHeap.print() ;
		System.out.println("After building the heap array");
//		maxHeap.buildMaxHeap(a) ;
		maxHeap.buildMaxHeap() ;
		maxHeap.print() ;

		System.out.println("Inserting elements 11 & 34");
		maxHeap.insertElement(11) ;
		maxHeap.insertElement(34) ;
		maxHeap.insertElement(314) ;
		maxHeap.print() ;
		
		System.out.println("After Heap sort:") ;
		maxHeap.heapSort() ;
		maxHeap.print() ;
	}
}

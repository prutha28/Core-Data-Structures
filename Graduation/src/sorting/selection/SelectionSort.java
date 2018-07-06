package sorting.selection;

public class SelectionSort {

	static int[] arr = { 23,3, 7, 99 , 111, 10000, 6 } ;

	public static void main(String[] args) {

		print() ;
		sort() ;
		print() ;
	}

	private static void sort() {

		int j = 0 ;	// pointer to the next position of insertion.

		for (int i = j+1 ; i < arr.length; i++) {
			int minIndex = findMinIndex(arr, i, arr.length-1) ;
			// Swap A[minIndex] & A[j]
			if( arr[minIndex] < arr[j]){
				int temp = arr[j] ;
				arr[j] = arr[minIndex] ;
				arr[minIndex] = temp ;
			}
			j++ ;
		}
	}

	private static int findMinIndex(int[] A, int start, int end) {
		int min = start ;
		for (int i = start+1; i < A.length; i++) {
			if( A[i] < A[min]){
				min = i ;
			}
		}
		return min;
	}

	private static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}


}

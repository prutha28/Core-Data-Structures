package binary.search.iterative;

public class BinarySearch {

	static int A[] = { 3, 3, 3, 6, 8, 112, 15} ; 

	public static void main(String[] args) {

		int start = 0 ;
		int end = A.length - 1 ;

		int x = 8 ;
		int index = BSearch(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);

		x = 112 ;
		index = BSearch(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);

		x = 10 ;
		index = BSearch(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);

		x = 3 ;
		index = BSearch(A, x, start, end) ;
		System.out.println( x + " was found first at index :" + index);

	}

	/**
	 * This function performs a simple binary search over the array
	 * @param A
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */

	private static int BSearch(int[] A, int x, int start, int end) {

		while( start <= end ){
			
			int mid = (start + end) /2 ;
			
			if( x < A[mid]){
				end = mid - 1 ;
			}
			
			else if( x > A[mid]){
				start = mid + 1 ;
			}
			
			else if( x == A[mid]){
				return mid ;
			}
			
			else{
				return -1 ;
			}
		
		}

		return -1 ;
	}
}

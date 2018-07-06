package linear.search.iterative;

public class LinearSearch {

	static int A[] = { 3, 3, 3, 6, 8, 112, 15} ; 

	public static void main(String[] args) {


		int start = 0 ;
		int end = A.length - 1 ;

		int x = 8 ;
		int index = search(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);

		x = 112 ;
		index = search(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);

		x = 10 ;
		index = search(A, x, start, end) ;
		System.out.println( x + " was found at index :" + index);
		
		x = 3 ;
		index = search(A, x, start, end) ;
		System.out.println( x + " was found first at index :" + index);
		
		System.out.println( x + " was found last at index :" + searchFull(A, x, start, end));

		
	}

	/**
	 * This function performs a simple linear search over the array
	 * and returns the index as soon as the element sought is first found.
	 * @param A
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private static int search(int[] A, int x, int start, int end) {

		int index = start ;

		while( index <= end ){
			if( x == A[index]){
				return index ;
			}
			index++ ;
		}

		return -1 ;
	}


	/**
	 * This function performs a simple linear search over the array
	 * and returns the index of the last occurrence of x.
	 * @param A
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private static int searchFull(int[] A, int x, int start, int end) {

		int index = start ;
		int returnIndex = -1 ;
		
		while( index <= end ){
			if( x == A[index]){
				returnIndex = index ;	// Instead of returning the index right away.
			}
			index++ ;
		}

		return returnIndex ;
	}



}

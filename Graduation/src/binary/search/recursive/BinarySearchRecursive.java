package binary.search.recursive;

public class BinarySearchRecursive {

	static int A[] = { 3, 3, 6, 112, 112, 112, 112} ; 

	public static void main(String[] args) {

		int start = 0 ;
		int end = A.length - 1 ;

		int x = 8 ;
		
		// Case 1: When element is not present in the array
		int index = BSearch_normal(A, x, start, end) ;
		System.out.println( x + " was found at index ( Normal) :" + index);

		index = BSearch_first(A, x, start, end) ;
		System.out.println( x + " was found at index ( First) :" + index);

		index = BSearch_last(A, x, start, end) ;
		System.out.println( x + " was found at index ( Last) :" + index);

		System.out.println("---------------------------------------------------");

		// Case 2: When element is present multiple times(even)
		x = 112 ;
		index = BSearch_normal(A, x, start, end) ;
		System.out.println( x + " was found at index ( Normal) :" + index);

		index = BSearch_first(A, x, start, end) ;
		System.out.println( x + " was found at index ( First) :" + index);

		index = BSearch_last(A, x, start, end) ;
		System.out.println( x + " was found at index ( Last) :" + index);

		// Case 2: When element is present multiple times(odd)
		System.out.println("---------------------------------------------------");
		x = 3 ;
		index = BSearch_normal(A, x, start, end) ;
		System.out.println( x + " was found at index ( Normal) :" + index);

		index = BSearch_first(A, x, start, end) ;
		System.out.println( x + " was found at index ( First) :" + index);

		index = BSearch_last(A, x, start, end) ;
		System.out.println( x + " was found at index ( Last) :" + index);
		
		// Case 4: When element is present only once
		
		System.out.println("---------------------------------------------------");
		x = 6 ;
		index = BSearch_normal(A, x, start, end) ;
		System.out.println( x + " was found at index ( Normal) :" + index);

		index = BSearch_first(A, x, start, end) ;
		System.out.println( x + " was found at index ( First) :" + index);

		index = BSearch_last(A, x, start, end) ;
		System.out.println( x + " was found at index ( Last) :" + index);
	}

	/** 
	 * This is the binary search in its simplest form.
	 * It is guaranteed to return the index of an element if found, if not -1.
	 * In case there are duplicates , it will return any on of the indices
	 * @param a
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private static int BSearch_normal(int[] a, int x, int start, int end) {

		// 1 Base condition		
		if( start > end)
			return -1 ;

		// 2 Base condition for finding the middle occurrence

		if( (start == end) && (x == a[start])){ // Tricky
			return start ;
		}


		int mid = (start + end ) /2 ;

		if( x < A[ mid]){

			return BSearch_normal(a, x, start, mid -1) ;

		}

		else if( x > A[mid]){

			return BSearch_normal(a, x, mid +1, end ) ;

		}

		else if ( x == A[mid]){

			return mid ;

		}

		else{

			return -1 ;
		}
	}

/**
 * This form of binary search returns the index of the first occurrence of the element if found.
 * else it return -1.
 * @param a
 * @param x
 * @param start
 * @param end
 * @return
 */
	private static int BSearch_first(int[] a, int x, int start, int end) {

		// 1 Base condition		

		if( start > end)
			return -1 ;

		// 2 Base condition for finding the first occurrence

		if( (x == a[start])){
			return start ;				// Tricky
		}

		int mid = (start + end ) /2 ;

		if ( x == A[mid])
			return mid ;

		else if( x < A[ mid])
			return BSearch_first(a, x, start, mid -1) ;

		else if( x > A[mid])
			return BSearch_first(a, x, mid +1, end ) ;

		else
			return -1;
	}

	/**
	 * This form of binary search returns the index of the last
	 * occurrence of the element if found else it return -1.
	 * @param a
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private static int BSearch_last(int[] a, int x, int start, int end) {

		// 1 Base condition for finding the last occurrence		
		if( start > end)
			return -1 ;

		// 2 Base condition
		if( (x == a[end]))		// Tricky
			return end ;

		int mid = (start + end ) /2 ;

		if ( x == A[mid])
			return mid ;

		else if( x < A[ mid])
			return BSearch_last(a, x, start, mid -1) ;

		else if( x > A[mid])
			return BSearch_last(a, x, mid +1, end ) ;

		else
			return -1 ;

	}
}

package searching.and.sorting;

public class MergingSortedArrays_11_1 {

	static int a[] = new int[12] ;
	static int b[] = {2, 5, 8, 19, 29, 50} ;

	public static void main(String[] args) {

		a[0] = 3 ;
		a[1] = 5 ;
		a[2] = 17 ;
		a[3] = 48 ;
		a[4] = 58 ;
		a[5] = 76 ;

		System.out.println("a") ;
		print(a) ;
		System.out.println("b") ;
		print(b) ;

		sortedMerge(6) ;
		System.out.println("a");
		print(a) ;

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
		System.out.println();
	}

	/**
	 * Given 2 arrays 'a' and 'b' which are already sorted,
	 * merge b into a, so that the resulting array is already sorted.
	 * 
	 * We start from the ends of the 2 arrays
	 * @param a
	 * @param b
	 * @return
	 */
	public static void sortedMerge( int numberOfElementsInA){
		int indexA = ( numberOfElementsInA -1) ;	// last index in a
		int indexB = ( b.length -1) ;	// last index in a
		int indexMerged = ( numberOfElementsInA + b.length -1) ;	// last index in merged A

		while( indexB >= 0 ){
			if( (indexA >= 0) && (a[indexA] >= b[indexB])){
				a[indexMerged] = a[indexA] ;
				indexA-- ;
			}else{
				a[indexMerged] = b[indexB] ;
				indexB-- ;
			}
			indexMerged--;
		}

	}


}

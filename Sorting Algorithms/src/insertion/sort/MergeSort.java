package insertion.sort;

public class MergeSort {

	static String[] arr = { "mary", "john", "jane" , "ana" , "peter", "heena", "cristina" , "nathan", "meredith", "Derek" }; 
	
	public static void main(String[] args) {
		
		System.out.println("Contents before sorting");
		print() ;
		
		System.out.println("Contents after sorting");
		mergesort( arr, 0, arr.length -1 ) ;
		print() ;
	}

	
	private static String[] mergesort( String[] arr, int begin, int end ) {

		String[] left ; 
		String[] right ;
		String[] result = null ;
		
		// BASE case
		if( begin > end)
			return null ;
		
		int mid = ( end - begin) /2 + begin /2 ;
		
		left = mergesort(arr, begin, mid) ;
		right = mergesort(arr, mid + 1 , end) ;
//		result = merge( left, right ) ;
		return result ;
	}


//	private static String[] merge(String[] left, String[] right) {
//
//	
//	}


	private static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}

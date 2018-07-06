package sorting.insertion;

/**
 * 
 * @author prutha
 *
 */
public class InsertionSort {

	static int[] arr = { 23,3, 7, 99 , 111, 10000, 6 } ;

	public static void main(String[] args) {

		print() ;
		sort() ;
		print() ;
	}

	private static void sort() {
		
		int i ; // Counter over the sorted part
		int j ; // Counter over the unsorted part
		int key ; // the element to insert into the sorted part.
		
		// We assume that by default the first element is sorted.
		// We start the sorting process from the second element.
		
		for( j = 1 ; j < arr.length; j++){
			key = arr[ j ] ;
			i = j - 1 ;
			while( i >= 0 && arr[ i ] > key){
				arr[ i + 1] = arr[ i ] ;
				i-- ;
			}
			arr[ i + 1 ] = key ;
		}
	}

	private static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}

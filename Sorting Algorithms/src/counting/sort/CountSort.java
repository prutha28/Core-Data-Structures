package counting.sort;
/**
 * ASSUMPTIONS :
 * 
 *  Each value is a non-negative integer value whose maximum value is atmost k.
 * 
 *  Counting sort is a stable sort: if two items have the same key as each other, 
 *  they should have the same relative position in the output as they did in the input.
 * 
 * @author prutha
 *
 */
public class CountSort {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 2, 1, 3, 4, 1, 2, 4 } ;
		int k = 5 ;
		new CountSort().sort( arr, k ) ;
	}

	private void sort(int[] A, int k) {

		int Count[] = new int[k+1] ;		// Tricky! size is (k+1)

		for (int i = 0; i < Count.length; i++) {
			Count[i]= 0 ;
		}

		// Count now contains the frequency count for each element in A.
		for (int i = 0; i < A.length; i++) {
			Count[A[i]] = Count[A[i]] + 1 ; 
		}

		//Count[i] contains the no of elements <= i
		for (int i = 1; i < Count.length; i++) {
			Count[i] = 	Count[i] + Count[i-1] ;																																																																																																																																																																												
		}

		// B is the output array
		int B[] = new int[ A.length] ;

		// at this point, each the element C[A[i]] represents the no of elements less than or equal to A[i]
		// Therefore, C[A[i]] should be the correct index position for A[i] in the output array.
		
		for (int i = B.length-1; i > 0; i--) {
			B[Count[A[i]] - 1] = A[i] ;				// Tricky! Dont forget the -1 in the index
			Count[A[i]]-- ;	
		}

		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
	}
}